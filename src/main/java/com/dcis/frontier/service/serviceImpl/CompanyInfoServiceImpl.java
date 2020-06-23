package com.dcis.frontier.service.serviceImpl;


import com.dcis.frontier.dao.CompanyInfoMapper;
import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.CompanyInfo;
import com.dcis.frontier.service.CompanyInfoService;
import com.dcis.frontier.until.ResultObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CompanyInfoServiceImpl implements CompanyInfoService {
    @Resource
    CompanyInfoMapper companyInfoMapper;

    @Override
    public ResultObject getCompanyInfo(Map map) {
        ResultObject resultObject = ResultObject.getInstance();
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum, pageSize);
        List<Map> list = companyInfoMapper.getCompanyInfo(map);
        PageInfo<Map> page = new PageInfo<Map>(list);
        resultObject.setData(page);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject insertCompanyInfo(CompanyInfo companyInfo) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(companyInfoMapper.insertSelective(companyInfo));
        return resultObject;
    }

    @Override
    public ResultObject deleteCompanyInfo(CompanyInfo companyInfo) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(companyInfoMapper.delete(companyInfo));
        return resultObject;
    }

    @Override
    public ResultObject updateCompanyInfo(CompanyInfo companyInfo) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(companyInfoMapper.updateByPrimaryKey(companyInfo));
        return resultObject;
    }

    @Override
    public ResultObject getCompanyKey(CompanyInfo clientMember) {
        ResultObject resultObject = ResultObject.getInstance();
        CompanyInfo data = companyInfoMapper.selectByPrimaryKey(clientMember);
        resultObject.setData(data);
        resultObject.setSuccess(true);
        return resultObject;
    }
}