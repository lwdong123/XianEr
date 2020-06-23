package com.dcis.frontier.service.serviceImpl;

import com.dcis.frontier.dao.UserMapper;
import com.dcis.frontier.models.Goods;
import com.dcis.frontier.models.User;
import com.dcis.frontier.service.UserService;
import com.dcis.frontier.until.ResultObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public ResultObject getDname(Map map) {
        ResultObject resultObject = ResultObject.getInstance();
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum, pageSize);
        List<Map> list = userMapper.getDname(map);
        PageInfo<Map> page = new PageInfo<Map>(list);
        resultObject.setData(page);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject insertUser(User user) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        user.setWorktime(new Date());
        resultObject.setData(userMapper.insertSelective(user));
        return resultObject;
    }

    @Override
    public ResultObject deleteUser(User user) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(userMapper.delete(user));
        return resultObject;
    }

    @Override
    public ResultObject updateUser(User user) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        user.setWorktime(new Date());
        resultObject.setData(userMapper.updateByPrimaryKey(user));
        return resultObject;
    }

    @Override
    public ResultObject getUserKey(User user) {
        ResultObject resultObject = ResultObject.getInstance();
        User data = userMapper.selectByPrimaryKey(user);
        resultObject.setData(data);
        resultObject.setSuccess(true);
        return resultObject;
    }
}