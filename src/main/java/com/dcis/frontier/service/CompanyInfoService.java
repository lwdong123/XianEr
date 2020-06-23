package com.dcis.frontier.service;

import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.CompanyInfo;
import com.dcis.frontier.until.ResultObject;

import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:57
 */
public interface CompanyInfoService {
    ResultObject getCompanyInfo(Map map);

    ResultObject insertCompanyInfo(CompanyInfo companyInfo);

    ResultObject deleteCompanyInfo(CompanyInfo companyInfo);

    ResultObject updateCompanyInfo(CompanyInfo companyInfo);

    ResultObject getCompanyKey(CompanyInfo CompanyInfo);
}
