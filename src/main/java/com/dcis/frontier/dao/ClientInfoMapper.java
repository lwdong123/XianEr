package com.dcis.frontier.dao;

import ch.qos.logback.core.net.server.Client;
import com.dcis.frontier.models.ClientInfo;
import com.dcis.frontier.models.Goods;
import com.dcis.frontier.models.Record;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ClientInfoMapper extends Mapper<ClientInfo> {
    List<Map> getClientInfo(Map map);

    List<Map> selectMaxMoney(Map map);

}