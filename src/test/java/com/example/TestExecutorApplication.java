package com.example;

import com.example.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 学习
 * @author xukai
 */
@SpringBootApplication(scanBasePackages = {"com.example.executor"})
@EnableAsync
public class TestExecutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestExecutorApplication.class, args);
    }
}
