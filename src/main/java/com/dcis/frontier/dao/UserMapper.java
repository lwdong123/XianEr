package com.dcis.frontier.dao;

import com.dcis.frontier.models.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Component
public interface UserMapper extends Mapper<User> {
    List<Map> getDname(Map map);

}