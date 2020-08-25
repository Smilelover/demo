package com.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: chenjianeng
 * @Date：2020/8/24 18:26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TimeTask {

   //private final TaskQueue queue = new TaskQueueu();

   //private final  TimerThread thread = new TimerThread(queue);

    @Test
    public void test() throws InterruptedException {

    }

    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("chenjianeng");
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task,0,1000);
    }
}






























