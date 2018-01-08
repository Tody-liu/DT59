/**
 * Project Name:lesson15
 * File Name:TestWindow.java
 * Package Name:com.yugle.exer
 * Date:2018年1月8日下午9:55:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午9:55:55 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */

// 使用实现Runnable方式来创建多线程
// 同步代码块的方式来同步，控制线程安全；
class Window implements Runnable {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (LOG) {
                if (ticket > 0) {
                    try {
                        Thread.currentThread().sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    LOG.info(Thread.currentThread().getName() + "售票，票号为：" + ticket--);
                }
            }
        }
    }
}

public class TestWindow {

    public static void main(String[] args) {

        Window w = new Window();

        Thread t1 = new Thread(w);

        Thread t2 = new Thread(w);

        Thread t3 = new Thread(w);

        t1.setName("窗口1");

        t2.setName("窗口2");

        t3.setName("窗口3");

        t1.start();

        t2.start();

        t3.start();

    }
}
