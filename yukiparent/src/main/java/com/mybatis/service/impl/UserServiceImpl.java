package com.mybatis.service.impl;

import com.mybatis.mapper.TbUserMapper;
import com.mybatis.pojo.TbUser;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: LHL
 * Date: 2018/4/13
 * Time: 20:50
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    /**
     * 使用@Autowired注解标注userMapper变量，
     * 当需要使用UserMapper时，Spring就会自动注入UserMapper
    */
     @Autowired
     private TbUserMapper userMapper;//注入dao
    @Override
    public void addUser(TbUser tbUser){
        userMapper.insert(tbUser);
    }

    @Override
    public TbUser getUserById(int userId){
        return userMapper.selectByPrimaryKey(userId);
    }
}
