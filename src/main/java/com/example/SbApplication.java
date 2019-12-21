package com.example;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class SbApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbApplication.class, args);
    }

    @Resource
    SqlSessionFactory sqlSessionFactory;

    @Override
    @SuppressWarnings("squid:S106")
    public void run(String... args) throws SQLException {
        initDb();
    }

    private void initDb() throws SQLException {
        Connection conn = sqlSessionFactory.openSession().getConnection();
        Statement statement = conn.createStatement();
        statement.addBatch("drop table if exists cities;");
        statement.addBatch("CREATE TABLE cities (\n" +
                "  id bigserial PRIMARY KEY,\n" +
                "  name varchar(255) DEFAULT NULL,\n" +
                "  state varchar(255) DEFAULT NULL,\n" +
                "  country varchar(255) DEFAULT NULL\n" +
                ");" );
        statement.addBatch("insert into cities (name, state, country) values ('Wuxi', 'Jiangsu', 'China');");

        System.out.println("Creating table in given database...");
        statement.executeBatch();
        System.out.println("Created table in given database...");
        statement.close();
        conn.close();
    }
}