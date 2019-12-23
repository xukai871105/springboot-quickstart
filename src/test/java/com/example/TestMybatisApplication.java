package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"com.example.student"})
@PropertySource(value = {"classpath:test.properties"})
public class TestMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMybatisApplication.class, args);
    }
}
