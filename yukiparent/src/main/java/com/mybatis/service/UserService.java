package com.mybatis.service;

import com.mybatis.pojo.TbUser;

/**
 * Created by IntelliJ IDEA.
 * User: LHL
 * Date: 2018/4/13
 * Time: 20:48
 */
public interface  UserService {
    //添加用户
    void addUser(TbUser user);
    //根据用户id获取用户
    TbUser getUserById(int userId);
}
