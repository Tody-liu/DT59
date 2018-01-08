/**
 * Project Name:DT59
 * File Name:TestThread.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午2:04:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午2:04:53 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see<br/>
 *           两种方式，创建线程并运行启动多个线程<br/>
 * 
 *           创建两个子线程，让其中一个输出1-100之间的偶数，另一个输出1-100之间的奇数。
 * 
 */
// 使用extends Thread 的方法来创建多线程
public class TestThread {

    public static void main(String[] args) {

        SubThread1 st1 = new SubThread1();

        SubThread2 st2 = new SubThread2();

        st1.setPriority(Thread.MAX_PRIORITY);

        st2.setPriority(Thread.MIN_PRIORITY);

        st1.start();// 奇数

        st2.start();// 偶数
    }

}

// 打印奇数的子线程
class SubThread1 extends Thread {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                LOG.info(Thread.currentThread().getName() + "========>" + i);
            }
        }
    }
}

// 打印偶数的子线程
class SubThread2 extends Thread {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                LOG.info(Thread.currentThread().getName() + "····>" + i);
            }
        }
    }
}
