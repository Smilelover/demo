package com.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoTest1 {

    /**
     * 斐波那西数量
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(test1(12));
    }


    @Test
    public static int test1(int number){
        if(number < 0){
            return 0;
        }else if (number == 1 || number == 2) {
            return 1;
        }else {
            return test1(number-1)+test1(number-2);
        }
    }
}

