package com.dcis.frontier.service;

import com.dcis.frontier.models.ClientInfo;
import com.dcis.frontier.until.ResultObject;

import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:57
 */
public interface ClientInfoService {
    ResultObject getClientInfo(Map map);

    ResultObject insertClientInfo(ClientInfo clientInfo);

    ResultObject deleteClientInfo(ClientInfo clientInfo);

    ResultObject updateClientInfo(ClientInfo clientInfo);

    ResultObject getClientKey(ClientInfo clientInfo);

    ResultObject copyClientInfo(ClientInfo clientInfo);

    ResultObject getTestOne(Map map);

    ResultObject getTestTwo(Map map);
}
