package com.karen.fan.business.mapper;

import com.karen.fan.business.model.UserModel;
import org.springframework.stereotype.Repository;

/**
 * @Date: 2015-10-24
 * @author: fan
 */
@Repository(value = "userMapper")
public interface UserMapper extends CrudMapper<UserModel, Long> {
    //Long save(UserModel user);
}
