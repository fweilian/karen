package com.karen.fan.business.dao.user;

import com.karen.fan.business.dao.AbstractBaseDaoImpl;
import com.karen.fan.business.mapper.CrudMapper;
import com.karen.fan.business.mapper.UserMapper;
import com.karen.fan.business.model.UserModel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Date: 2015-10-24
 * @author: fan
 */
@Repository(value = "userDao")
public class UserDaoImpl extends AbstractBaseDaoImpl<UserModel, Long> implements UserDao {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    protected CrudMapper getMapper() {
        return userMapper;
    }

    /*@Override
    public Long save(UserModel entity) {
        return userMapper.save(entity);
    }*/
}
