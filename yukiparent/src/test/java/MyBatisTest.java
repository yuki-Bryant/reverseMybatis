import com.mybatis.pojo.TbUser;
import com.mybatis.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: LHL
 * Date: 2018/4/13
 * Time: 20:54
 */
public class MyBatisTest {
    private UserService userService;

    @Before
    public void before() {
        //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-mybatis.xml"});
        //从Spring容器中根据bean的id取出我们要使用的userService对象
        userService = (UserService) ac.getBean("userService");
    }

    @Test
    public void testAddUser(){
        TbUser tbUser = new TbUser();
        tbUser.setId(2);
        tbUser.setName("liu");
        tbUser.setAge(24);
        tbUser.setTelephone(18982064760L);
        userService.addUser(tbUser);
        System.out.println("数据库插入成功");
    }

    @Test
    public void testGetUser(){
        int id = 1;
        TbUser tbUser = userService.getUserById(id);
        System.out.println(tbUser.getName()+"\t"+tbUser.getAge()+"\t"+tbUser.getTelephone());
    }
}
