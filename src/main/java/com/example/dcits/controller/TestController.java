package com.example.dcits.controller;

import com.example.dcits.service.TestService;
import com.example.dcits.until.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author dongliwen
 * @date 2019\6\10 0010 14:19
 */
@RequestMapping(value = "/TestController")
@ResponseBody
@Controller
@CrossOrigin
public class TestController {
    @Autowired
    TestService testService;
///111111111111
    @RequestMapping("/getChwfwgryInfo")
    @ResponseBody
    public ResultObject getChwfwgryInfo(@RequestBody Map map) {
        return null;
    }
}
