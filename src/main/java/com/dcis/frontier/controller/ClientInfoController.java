package com.dcis.frontier.controller;

import com.dcis.frontier.models.ClientInfo;
import com.dcis.frontier.service.ClientInfoService;
import com.dcis.frontier.service.GoodsService;
import com.dcis.frontier.until.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:16
 */
@Controller
@CrossOrigin
@RequestMapping("/ClientInfoController")
@ResponseBody
public class ClientInfoController {

    /**
     * 练习题2
     * @param map
     * @return
     */
    @RequestMapping("/getTestTwo")
    @ResponseBody
    public ResultObject getTestTwo(@RequestBody Map map){
        return clientInfoService.getTestTwo(map);
    }

    /**
     *
     * @param map
     * @return
     */
    @RequestMapping("/getTestOne")
    @ResponseBody
    public ResultObject getTestOne(@RequestBody Map map){
        return clientInfoService.getTestOne(map);
    }


    @Autowired
    ClientInfoService clientInfoService;
    @RequestMapping("/getClientInfo")
    @ResponseBody
    public ResultObject getClientInfo(@RequestBody Map map){
        return clientInfoService.getClientInfo(map);
    }

    @RequestMapping("/insertClientInfo")
    @ResponseBody
    public ResultObject insertClientInfo(@RequestBody ClientInfo clientInfo){
        return clientInfoService.insertClientInfo(clientInfo);
    }

    @RequestMapping("/deleteClientInfo")
    @ResponseBody
    public ResultObject deleteClientInfo(@RequestBody ClientInfo clientInfo){
        return clientInfoService.deleteClientInfo(clientInfo);
    }

    @RequestMapping("/updateClientInfo")
    @ResponseBody
    public ResultObject updateClientInfo(@RequestBody ClientInfo clientInfo){
        return clientInfoService.updateClientInfo(clientInfo);
    }

    @RequestMapping("/getClientKey")
    @ResponseBody
    public ResultObject getClientKey(@RequestBody ClientInfo clientInfo){
        return clientInfoService.getClientKey(clientInfo);
    }

    @RequestMapping("/copyClientInfo")
    @ResponseBody
    public ResultObject copyClientInfo(@RequestBody ClientInfo clientInfo){
        return clientInfoService.copyClientInfo(clientInfo);
    }

}
