package com.karen.fan.business.service.impl;

import com.karen.fan.business.dao.user.UserDao;
import com.karen.fan.business.model.UserModel;
import com.karen.fan.business.service.UserService;
import com.karen.fan.common.entity.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Date: 2015-10-24
 * @author: fan
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;
    @Override
    public Long addUser(UserInfo user) {
        UserModel entity = new UserModel();
        entity.setUserName(user.getUserName());
        return userDao.save(entity);
    }
}
