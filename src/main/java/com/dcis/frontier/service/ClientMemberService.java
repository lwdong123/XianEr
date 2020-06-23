package com.dcis.frontier.service;

import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.until.ResultObject;

import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:57
 */
public interface ClientMemberService {
    ResultObject getClientMember(Map map);

    ResultObject insertClientMember(ClientMember clientMember);

    ResultObject deleteClientMember(ClientMember clientMember);

    ResultObject updateClientMember(ClientMember clientMember);

    ResultObject getMemberKey(ClientMember clientMember);
}
