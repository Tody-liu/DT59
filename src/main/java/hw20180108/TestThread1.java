/**
 * Project Name:DT59
 * File Name:TestThread1.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:37:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:37:36 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
// 使用implements Runnable 的方法来创建多线程
public class TestThread1 {

    public static void main(String[] args) {
        SubThread3 st3 = new SubThread3();

        SubThread4 st4 = new SubThread4();

        // new Thread(st3).start();
        //
        // new Thread(st4).start();

        Thread t1 = new Thread(st3);
        Thread t2 = new Thread(st4);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }

}

// 打印奇数的子线程
class SubThread3 implements Runnable {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                LOG.info(Thread.currentThread().getName() + "····>" + i);
            }
        }
    }
}

// 打印偶数的子线程
class SubThread4 implements Runnable {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                LOG.info(Thread.currentThread().getName() + "========>" + i);
            }
        }
    }
}
