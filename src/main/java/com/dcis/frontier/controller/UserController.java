package com.dcis.frontier.controller;

import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.User;
import com.dcis.frontier.service.UserService;
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
@RequestMapping("/UserController")
@ResponseBody
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getDname")
    @ResponseBody
    public ResultObject getDname(@RequestBody Map map){
        return userService.getDname(map);
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public ResultObject insertRecord(@RequestBody User user){
        return userService.insertUser(user);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public ResultObject deleteClientInfo(@RequestBody User user){
        return userService.deleteUser(user);
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public ResultObject updateRecord(@RequestBody User user){
        return userService.updateUser(user);
    }

    @RequestMapping("/getUserKey")
    @ResponseBody
    public ResultObject getUserKey(@RequestBody User user){
        return userService.getUserKey(user);
    }
}
