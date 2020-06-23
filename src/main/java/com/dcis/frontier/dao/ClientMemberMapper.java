package com.dcis.frontier.dao;

import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.Goods;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ClientMemberMapper extends Mapper<ClientMember> {
    List<Map> getClientMember(Map map);

    int updateRemainMoney(ClientMember clientMember);

    List<Map>  getMoneyByPhone(Map map);
}