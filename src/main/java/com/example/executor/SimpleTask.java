package com.example.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xukai
 */
@Service
public class SimpleTask {

    private static Logger log = LoggerFactory.getLogger(SimpleTask.class);

    @Async
    public void runOnce() throws InterruptedException {
        final String pattern = "yyyy-MM-dd HH:mm:ss";
        String dateString = String.format("%s ", new SimpleDateFormat(pattern).format(new Date()));
        // 间隔一定时间，连续运行5次，模拟线程阻塞
        for (int i = 0; i < 5; i++) {
            log.info("Running " + dateString + " " + Thread.currentThread().getName());
            Thread.sleep(5000);
        }
    }
}
