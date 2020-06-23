package com.dcis.frontier.dao;

import com.dcis.frontier.models.CompanyInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface CompanyInfoMapper extends Mapper<CompanyInfo> {
    List<Map> getCompanyInfo(Map map);
}