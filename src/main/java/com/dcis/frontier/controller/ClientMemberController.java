package com.dcis.frontier.controller;

import com.dcis.frontier.models.ClientInfo;
import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.service.ClientMemberService;
import com.dcis.frontier.until.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:16
 */
@Controller
@CrossOrigin
@RequestMapping("/ClientMemberController")
@ResponseBody
public class ClientMemberController {
    @Autowired
    ClientMemberService clientMemberService;
    @RequestMapping("/getClientMember")
    @ResponseBody
    public ResultObject getClientMember(@RequestBody Map map){
        return clientMemberService.getClientMember(map);
    }

    @RequestMapping("/insertClientMember")
    @ResponseBody
    public ResultObject insertClientMember(@RequestBody ClientMember clientMember){
        return clientMemberService.insertClientMember(clientMember);
    }

    @RequestMapping("/deleteClientMember")
    @ResponseBody
    public ResultObject deleteClientMember(@RequestBody ClientMember clientMember){
        return clientMemberService.deleteClientMember(clientMember);
    }

    @RequestMapping("/updateClientMember")
    @ResponseBody
    public ResultObject updateClientInfo(@RequestBody ClientMember clientMember){
        return clientMemberService.updateClientMember(clientMember);
    }
    @RequestMapping("/getMemberKey")
    @ResponseBody
    public ResultObject getClientKey(@RequestBody ClientMember clientMember){
        return clientMemberService.getMemberKey(clientMember);
    }
}
