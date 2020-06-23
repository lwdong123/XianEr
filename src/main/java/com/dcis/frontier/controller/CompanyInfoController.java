package com.dcis.frontier.controller;

import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.CompanyInfo;
import com.dcis.frontier.service.CompanyInfoService;
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
@RequestMapping("/CompanyInfoController")
@ResponseBody
public class CompanyInfoController {
    @Autowired
    CompanyInfoService companyInfoService;
    @RequestMapping("/getCompanyInfo")
    @ResponseBody
    public ResultObject getCompanyInfo(@RequestBody Map map){
        return companyInfoService.getCompanyInfo(map);
    }

    @RequestMapping("/insertCompanyInfo")
    @ResponseBody
    public ResultObject insertCompanyInfo(@RequestBody CompanyInfo companyInfo){
        return companyInfoService.insertCompanyInfo(companyInfo);
    }

    @RequestMapping("/deleteCompanyInfo")
    @ResponseBody
    public ResultObject deleteCompanyInfo(@RequestBody CompanyInfo companyInfo){
        return companyInfoService.deleteCompanyInfo(companyInfo);
    }

    @RequestMapping("/updateCompanyInfo")
    @ResponseBody
    public ResultObject updateCompanyInfo(@RequestBody CompanyInfo companyInfo){
        return companyInfoService.updateCompanyInfo(companyInfo);
    }
    @RequestMapping("/getCompanyKey")
    @ResponseBody
    public ResultObject getCompanyKey(@RequestBody CompanyInfo companyInfo){
        return companyInfoService.getCompanyKey(companyInfo);
    }
}
