package com.dcis.frontier.controller;

import com.dcis.frontier.models.Goods;
import com.dcis.frontier.models.Record;
import com.dcis.frontier.service.RecordService;
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
@RequestMapping("/RecordController")
@ResponseBody
public class RecordController {
    @Autowired
    RecordService recordService;
    @RequestMapping("/getRecord")
    @ResponseBody
    public ResultObject getRecord(@RequestBody Map map){
        return recordService.getRecord(map);
    }

    @RequestMapping("/insertRecord")
    @ResponseBody
    public ResultObject insertRecord(@RequestBody Record record){
        return recordService.insertRecord(record);
    }

    @RequestMapping("/deleteRecord")
    @ResponseBody
    public ResultObject deleteClientInfo(@RequestBody Record record){
        return recordService.deleteRecord(record);
    }

    @RequestMapping("/updateRecord")
    @ResponseBody
    public ResultObject updateRecord(@RequestBody Record record){
        return recordService.updateRecord(record);
    }

    @RequestMapping("/getRecordKey")
    @ResponseBody
    public ResultObject getRecordKey(@RequestBody Record record){
        return recordService.getRecordKey(record);
    }

    @RequestMapping("/reviewRecord")
    @ResponseBody
    public ResultObject reviewRecord(@RequestBody Record record){
        return recordService.reviewRecord(record);
    }

    @RequestMapping("/getRecordName")
    @ResponseBody
    public ResultObject getRecordName(@RequestBody Record record){
        return recordService.getRecordName();
    }
}
