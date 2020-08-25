package com.example.demo;

import com.sun.istack.internal.logging.Logger;

/**
 * @Author: chenjianeng
 * @Date：2020/8/25 10:45
 */
public class TaskJob {

    public static Logger log = Logger.getLogger(TaskJob.class);

    public void SayHello() {
        // TODO Auto-generated method stub
        try {
            log.info("处理任务开始>........");
            // 业务逻辑代码调用
            System.out.println("时间[" + new java.util.Date().toLocaleString() + "]----->大家好啊！");
            log.info("处理任务结束!");
        } catch (Exception e) {
            log.info("处理任务出现异常", e);
        }
    }
}
