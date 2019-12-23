package com.example;

import com.example.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 学习使用spring的bean
 * @author xukai
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {TestBeanApplication.class})
public class SpringBeanUseTest {

    /**
     * 通过Autowired注解，获得 defaultUser 和 rootUser
     * 通过注解方法，和 new User -> .set 过程相同
     */
    @Autowired
    User defaultUser;

    @Autowired
    User rootUser;

    @Test
    public void testCommon() {
        System.out.println("Get defaultUser " + defaultUser.toString());
        System.out.println("Get rootUser " + rootUser.toString());
    }
}
