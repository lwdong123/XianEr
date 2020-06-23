package com.dcis.frontier.service.serviceImpl;

import com.dcis.frontier.dao.ClientInfoMapper;
import com.dcis.frontier.dao.ClientMemberMapper;
import com.dcis.frontier.dao.GoodsMapper;
import com.dcis.frontier.models.ClientInfo;
import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.Goods;
import com.dcis.frontier.service.ClientInfoService;
import com.dcis.frontier.until.ResultObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ClientInfoServiceImpl implements ClientInfoService {
    @Resource
    ClientInfoMapper clientInfoMapper;
    @Resource
    GoodsMapper goodsMapper;
    @Resource
    ClientMemberMapper clientMemberMapper;

    @Override
    public ResultObject getTestOne(Map map) {
        int num = Integer.parseInt(map.get("num").toString());
        ResultObject resultObject = ResultObject.getInstance();
        int sum=0;
        for (int i = 1; i <=num ; i++) {
            System.out.print(i+",");
            sum+=i;
        }
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("gName", sum);
        resultObject.setData(objectObjectHashMap);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject getTestTwo(Map map) {
        int num = Integer.parseInt(map.get("num").toString());
        ResultObject resultObject = ResultObject.getInstance();
        StringBuffer sb = new StringBuffer("");
        String str = "";
        for (int i = 1; i <=num ; i++) {
            if (i%3==0&&i%5==0) {
                str="UPDOWN";
            }else if(i%3==0){
                str = "UP";
            } else if(i%5==0){
                str = "DOWN";
            } else{
                str=i+"";
            }
            sb.append(i+"-"+str+"\n");
        }
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("gName2", sb);
        resultObject.setData(objectObjectHashMap);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject getClientInfo(Map map) {
        ResultObject resultObject = ResultObject.getInstance();
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum, pageSize);
        List<Map> list = clientInfoMapper.getClientInfo(map);
        PageInfo<Map> page = new PageInfo<Map>(list);
        resultObject.setData(page);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject insertClientInfo(ClientInfo clientInfo) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        clientInfo.setRecentBuying(new Date());
        HashMap<Object, Object> map = new HashMap<>();
        map.put("gName", clientInfo.getOrderGoods());
        //利润
        List<Map> list = goodsMapper.getBuyingPriceByGoodsName(map);
        Integer a1= Integer.parseInt(list.get(0).get("stock_num").toString());//库存数量
        Integer a2=clientInfo.getOrderNum(); //订单数量
        Goods goods = new Goods();
        goods.setStockNum(a1.intValue()-a2.intValue());//库存剩余
        goods.setgName(clientInfo.getOrderGoods());
        goods.setRecentDate(new Date());//最近购买时间
        BigDecimal buyingPrice = new BigDecimal(list.get(0).get("buying_price").toString());//进价
        BigDecimal profit =clientInfo.getDealMoney().subtract(buyingPrice.multiply(new BigDecimal(clientInfo.getOrderNum())));
        BigDecimal goodsProfit=profit.add(list.get(0).get("profit")!=null?new BigDecimal(list.get(0).get("profit").toString()):new BigDecimal(0));
        goods.setProfit(goodsProfit); //商品中心单间商品的利润叠加
        goodsMapper.updateStockNum(goods);
        clientInfo.setProfit(profit);
        //总利润
        BigDecimal allProfit = clientInfo.getAllProfit()==null?new BigDecimal(0):clientInfo.getAllProfit();
        allProfit=allProfit.add(profit);
        clientInfo.setAllProfit(allProfit);
        //手机号
        map.put("mobilePhone", clientInfo.getMobilePhone());
        List<Map> list2 = clientMemberMapper.getMoneyByPhone(map);
        //剩余金额
        if (list2.size()!=0) {
            BigDecimal remainMoney= new BigDecimal(list2.get(0).get("remain_money").toString());
            //交易金额
            BigDecimal dealMoney= clientInfo.getDealMoney();
            BigDecimal remainMoney2 = remainMoney.subtract(dealMoney);
            ClientMember clientMember = new ClientMember();
            //根据手机号码，修改总价
            clientMember.setRemainMoney(remainMoney2);
            clientMember.setMobliePhone( clientInfo.getMobilePhone());
            clientMemberMapper.updateRemainMoney(clientMember);
        }
        //总交易金额
        BigDecimal allDealMoney = clientInfo.getAllDealMoney()==null?new BigDecimal(0):clientInfo.getAllDealMoney();
        allDealMoney=allDealMoney.add(clientInfo.getDealMoney());
//        BigDecimal dealMoney =clientInfo.getDealMoney();
        clientInfo.setAllDealMoney(allDealMoney);
        resultObject.setData(clientInfoMapper.insertSelective(clientInfo));
        return resultObject;

    }

    @Override
    public ResultObject deleteClientInfo(ClientInfo clientInfo) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(false);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("mobilePhone", clientInfo.getMobilePhone());
        List<Map> list = clientInfoMapper.selectMaxMoney(map);
        if (new BigDecimal(list.get(0).get("allDealMoney").toString()).compareTo(clientInfo.getAllDealMoney())==0){
            resultObject.setSuccess(true);
            resultObject.setData(clientInfoMapper.delete(clientInfo));
        }
        if (clientInfo.getOrderNum()!=null&&clientInfo.getOrderNum()!=0){
            Integer orderNum=clientInfo.getOrderNum();
            String orderGoods=clientInfo.getOrderGoods();
            BigDecimal profit=clientInfo.getProfit();
            HashMap<Object, Object> map1 = new HashMap<>();
            map.put("gName", orderGoods);
            List<Map> list1 = goodsMapper.getBuyingPriceByGoodsName(map);
            if (list1.size()!=0) {
                BigDecimal bg1 = list1.get(0).get("profit") != null ? new BigDecimal(list1.get(0).get("profit").toString()) : new BigDecimal(0);
                BigDecimal bgPro = bg1.subtract(profit);
                Integer it1=Integer.parseInt(list1.get(0).get("stock_num").toString());
                Goods goods = new Goods();
                goods.setProfit(bgPro);
                goods.setStockNum(it1.intValue()+orderNum);
                goods.setRecentDate(new Date());
                goods.setgName(orderGoods);
                goodsMapper.updateStockNum(goods);
            }
        }
        return resultObject;
    }

    @Override
    public ResultObject updateClientInfo(ClientInfo clientInfo) {
        ResultObject resultObject = ResultObject.getInstance();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("gName", clientInfo.getOrderGoods());
        //利润
        List<Map> list = goodsMapper.getBuyingPriceByGoodsName(map);
        Integer a1= Integer.parseInt(list.get(0).get("stock_num").toString());//库存数量
        Integer a2=clientInfo.getOrderNum(); //订单数量
        Goods goods = new Goods();
        goods.setStockNum(a1.intValue()-a2.intValue());//库存剩余
        goods.setgName(clientInfo.getOrderGoods());
        goods.setRecentDate(new Date());//最近购买时间
        BigDecimal buyingPrice = new BigDecimal(list.get(0).get("buying_price").toString());//进价
        BigDecimal profit =clientInfo.getDealMoney().subtract(buyingPrice.multiply(new BigDecimal(clientInfo.getOrderNum())));
        BigDecimal goodsProfit=profit.add(list.get(0).get("profit")!=null?new BigDecimal(list.get(0).get("profit").toString()):new BigDecimal(0));
        goods.setProfit(goodsProfit); //商品中心单间商品的利润叠加
        goodsMapper.updateStockNum(goods);
        clientInfo.setProfit(profit);
        //总利润
        BigDecimal allProfit = clientInfo.getAllProfit()==null?new BigDecimal(0):clientInfo.getAllProfit();
        allProfit=allProfit.add(profit);
        clientInfo.setAllProfit(allProfit);
        //手机号
        map.put("mobilePhone", clientInfo.getMobilePhone());
        List<Map> list2 = clientMemberMapper.getMoneyByPhone(map);
        //剩余金额
        if (list2.size()!=0) {
            BigDecimal remainMoney= new BigDecimal(list2.get(0).get("remain_money").toString());
            //交易金额
            BigDecimal dealMoney= clientInfo.getDealMoney();
            BigDecimal remainMoney2 = remainMoney.subtract(dealMoney);
            ClientMember clientMember = new ClientMember();
            //根据手机号码，修改胜负金额
            clientMember.setRemainMoney(remainMoney2);
            clientMember.setMobliePhone( clientInfo.getMobilePhone());
            clientMemberMapper.updateRemainMoney(clientMember);
        }
        //总交易金额
        BigDecimal allDealMoney = clientInfo.getAllDealMoney()==null?new BigDecimal(0):clientInfo.getAllDealMoney();
        allDealMoney=allDealMoney.add(clientInfo.getDealMoney());
        clientInfo.setAllDealMoney(allDealMoney);
        resultObject.setData(clientInfoMapper.updateByPrimaryKeySelective(clientInfo));
        return resultObject;
    }

    @Override
    public ResultObject getClientKey(ClientInfo clientInfo) {
        ResultObject resultObject = ResultObject.getInstance();
        ClientInfo data = clientInfoMapper.selectByPrimaryKey(clientInfo);
        resultObject.setData(data);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject copyClientInfo(ClientInfo clientInfo) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(false);
        clientInfo.setRecentBuying(new Date());
        //防止复制不是最近一条，做判断
        HashMap<Object, Object> map = new HashMap<>();
        map.put("mobilePhone", clientInfo.getMobilePhone());
        List<Map> list = clientInfoMapper.selectMaxMoney(map);
        if (new BigDecimal(list.get(0).get("allDealMoney").toString()).compareTo(clientInfo.getAllDealMoney())==0){
            clientInfoMapper.insertSelective(clientInfo);
            resultObject.setSuccess(true);
        }
        return resultObject;
    }


}