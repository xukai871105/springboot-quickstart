package com.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过Bean构造一个 user
 * @author xukai
 */
@Configuration
public class UserConfig {

    @Bean("defaultUser")
    public User buildDefaultUser() {
        User user = new User();
        user.setName("Jame");
        user.setAge(35);
        return user;
    }
}
