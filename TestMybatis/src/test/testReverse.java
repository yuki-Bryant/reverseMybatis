package test;

import com.mybatis.mapper.TbUserMapper;
import com.mybatis.pojo.TbUser;
import com.mybatis.pojo.TbUserExample;

/**
 * Created by IntelliJ IDEA.
 * User: LHL
 * Date: 2018/4/13
 * Time: 19:27
 */
public class testReverse {
    private static UserService userService;
    public static TbUser getUserIdById(int userId){
        TbUser user = userService.getUserById(userId);
        return user;
    }
    public static void main(String[] args) {
        TbUser user = getUserIdById(1);
        System.out.println(user.getAge());
    }
}
