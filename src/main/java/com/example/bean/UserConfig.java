package com.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过Bean构造一个 user
 * @author xukai
 */
@Configuration
public class UserConfig {

    /**
     * name 和 age 均在配置文件中设置
     */
    @Value("${user.default.name}")
    String name;
    @Value("${user.default.age}")
    Integer age;

    @Bean("defaultUser")
    public User buildDefaultUser() {
        User user = new User();
        user.setName(this.name);
        user.setAge(this.age);
        return user;
    }
}
