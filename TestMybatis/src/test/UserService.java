package test;

import com.mybatis.pojo.TbUser;

/**
 * Created by IntelliJ IDEA.
 * User: LHL
 * Date: 2018/4/13
 * Time: 19:32
 */
public interface UserService {
    TbUser getUserById(int Id);
}
