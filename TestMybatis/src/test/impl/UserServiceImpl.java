package test.impl;

import com.mybatis.mapper.TbUserMapper;
import com.mybatis.pojo.TbUser;

/**
 * Created by IntelliJ IDEA.
 * User: LHL
 * Date: 2018/4/13
 * Time: 19:35
 */
public class UserServiceImpl {
    TbUserMapper tbUserMapper;
    public TbUser getItemById(int Id) {
        TbUser user = tbUserMapper.selectByPrimaryKey(Id);
        return user;
    }
}
