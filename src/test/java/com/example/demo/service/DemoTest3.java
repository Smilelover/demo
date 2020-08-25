package com.example.demo.service;

import com.example.demo.MultithreadScheduleTask;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: chenjianeng
 * @Date：2020/8/25 13:05
 */
public class DemoTest3 {

    @Autowired
    private MultithreadScheduleTask multithreadScheduleTask;


    @Test
    public void test() throws InterruptedException {
        multithreadScheduleTask.first();
        multithreadScheduleTask.second();
    }
}
