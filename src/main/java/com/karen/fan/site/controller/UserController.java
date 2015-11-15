package com.karen.fan.site.controller;

import com.karen.fan.business.service.UserService;
import com.karen.fan.common.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Date: 2015-10-24
 * @author: fan
 */
@Controller
@RequestMapping("/user")
public class UserController extends BasicController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(HttpServletRequest httpRequest) {
        LOGGER.info("add user");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("fan");
        userService.addUser(userInfo);
        return "hello";
    }
}
