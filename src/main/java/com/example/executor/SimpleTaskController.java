package com.example.executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xukai
 */
@RestController
public class SimpleTaskController {
    @Autowired
    private SimpleTask simpleTask;

    @GetMapping("/task")
    public String doSimpleTaskOnce() {
        try {
            // 注意异步调用没有返回值
            simpleTask.runOnce();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        final String pattern = "yyyy-MM-dd HH:mm:ss";
        return String.format("%s ", new SimpleDateFormat(pattern).format(new Date()));
    }
}
