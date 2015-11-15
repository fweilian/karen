package com.karen.fan.business.model;

/**
 * @Date: 2015-10-24
 * @author: fan
 */
public class UserModel {
    private Long userId;
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
