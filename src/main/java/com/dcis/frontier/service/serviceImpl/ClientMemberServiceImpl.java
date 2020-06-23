package com.dcis.frontier.service.serviceImpl;

import com.dcis.frontier.dao.ClientInfoMapper;
import com.dcis.frontier.dao.ClientMemberMapper;
import com.dcis.frontier.models.ClientInfo;
import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.Goods;
import com.dcis.frontier.service.ClientMemberService;
import com.dcis.frontier.service.ClientInfoService;
import com.dcis.frontier.until.ResultObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
class ClientMemberServiceImpl implements ClientMemberService {
    @Resource
    ClientMemberMapper clientMemberMapper;
    @Resource
    ClientInfoService clientInfoService;

    @Override
    public ResultObject getClientMember(Map map) {
        ResultObject resultObject = ResultObject.getInstance();
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum, pageSize);
        List<Map> list = clientMemberMapper.getClientMember(map);
        PageInfo<Map> page = new PageInfo<Map>(list);
        resultObject.setData(page);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject insertClientMember(ClientMember clientMember) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        clientMember.setRemainMoney(clientMember.getCustomMoney());
        clientMember.setRecentRechargeTime(new Date());
        clientMemberMapper.insertSelective(clientMember);
        resultObject.setData(null);
        return resultObject;
    }

    @Override
    public ResultObject deleteClientMember(ClientMember clientMember) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(clientMemberMapper.delete(clientMember));
        return resultObject;
    }

    @Override
    public ResultObject updateClientMember(ClientMember clientMember) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        clientMember.setRecentRechargeTime(new Date());
        //剩余金额=原剩余金额+自定义金额
        BigDecimal remainMoney = clientMember.getRemainMoney();
        BigDecimal customMoney = clientMember.getCustomMoney();
        BigDecimal remainMoney2 = remainMoney.add(customMoney);
        clientMember.setRemainMoney(remainMoney2);
        resultObject.setData(clientMemberMapper.updateByPrimaryKey(clientMember));
        return resultObject;
    }

    public ResultObject getMemberKey(ClientMember clientMember) {
        ResultObject resultObject = ResultObject.getInstance();
        ClientMember data = clientMemberMapper.selectByPrimaryKey(clientMember);
        resultObject.setData(data);
        resultObject.setSuccess(true);
        return resultObject;
    }
}