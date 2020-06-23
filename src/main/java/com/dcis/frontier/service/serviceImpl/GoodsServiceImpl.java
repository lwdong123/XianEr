package com.dcis.frontier.service.serviceImpl;

import com.dcis.frontier.dao.GoodsMapper;
import com.dcis.frontier.dao.RecordMapper;
import com.dcis.frontier.models.CompanyInfo;
import com.dcis.frontier.models.Goods;
import com.dcis.frontier.service.GoodsService;
import com.dcis.frontier.until.ResultObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Resource
    RecordMapper recordMapper;

    @Override
    public ResultObject getDname(Map map) {
        ResultObject resultObject = ResultObject.getInstance();
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum, pageSize);
        List<Map> list = goodsMapper.getDname(map);
        PageInfo<Map> page = new PageInfo<Map>(list);
        resultObject.setData(page);
        resultObject.setSuccess(true);
        System.out.println(2222);
        return resultObject;
    }

    @Override
    public ResultObject insertGoods(Goods goods) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        goods.setPurchaseDate(new Date());
//        goods.setRecentDate(new Date());
        goods.setStockNum(goods.getPurchaseNum());
        resultObject.setData(goodsMapper.insertSelective(goods));
        return resultObject;
    }

    @Override
    public ResultObject deleteGoods(Goods goods) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(goodsMapper.delete(goods));
        return resultObject;
    }

    @Override
    public ResultObject updateGoods(Goods goods) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(goodsMapper.updateByPrimaryKey(goods));
        return resultObject;
    }

    @Override
    public ResultObject getMemberKey(Goods goods) {
            ResultObject resultObject = ResultObject.getInstance();
            Goods data = goodsMapper.selectByPrimaryKey(goods);
            resultObject.setData(data);
            resultObject.setSuccess(true);
            return resultObject;
    }
    @Override
    public ResultObject getGoodsInfoByName(Goods goods) {
        ResultObject resultObject = ResultObject.getInstance();
        Goods data = recordMapper.getGoodsInfoByName(goods);
        if (data!=null) {
            resultObject.setData(data);
        }else{
            Goods goods1 = new Goods();
            goods.setCurr("");
            resultObject.setData(goods);
        }
        resultObject.setSuccess(true);
        return resultObject;
    }
}