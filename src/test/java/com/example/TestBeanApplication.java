package com.example;

import com.example.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = {"com.example.bean"})
@ImportResource(locations = {"classpath*:userbeans.xml"})
public class TestBeanApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(TestBeanApplication.class, args);

        // 测试第一种构造方法，通过Config构造
        User defaultUser = context.getBean("defaultUser", User.class);
        System.out.println("defaultUser constructed by config.java " + defaultUser.toString());

        // 测试第二种构造方法，通过XML构造
        User rootUser = context.getBean("rootUser", User.class);
        System.out.println("rootUser constructed by beans.xml " + rootUser.toString());

    }
}
