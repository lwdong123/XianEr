package com.dcis.frontier.service;

import com.dcis.frontier.models.User;
import com.dcis.frontier.until.ResultObject;

import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:57
 */
public interface UserService {
    ResultObject getDname(Map map);

    ResultObject insertUser(User user);

    ResultObject deleteUser(User user);

    ResultObject updateUser(User user);

    ResultObject getUserKey(User user);
}
