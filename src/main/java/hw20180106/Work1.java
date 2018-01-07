/**
 * Project Name:DT59
 * File Name:Work1.java
 * Package Name:hw20180106
 * Date:2018年1月6日下午6:42:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180106;

import java.io.File;

import org.apache.log4j.Logger;
import org.junit.Test;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午6:42:59 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/*
 * 5.1. 编程输出指定目录中的所有文件（包括子目录中的文件）
 */
public class Work1 {

    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {
        Work1 work = new Work1();
        String pathname = "E:\\eclipse";
        File dir = new File(pathname);
        work.listDirectory(dir);
    }

    // 在网上找的方法，自己写暂时写不出来。目前能看懂。
    // 考虑到使用路径名作为形参传进该方法，但是实际情况不行。
    // 每次读取到的是目录名和文件名，路径要使用getAbsolutePath() 来获取。
    public void listDirectory(File dir) {
        if (!dir.exists()) {
            throw new IllegalArgumentException("目录" + dir + "不存在");
        }
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir + "不是目录");
        }
        File[] files = dir.listFiles();
        if (files != null && files.length > 0) {
            // 使用增强for循环的方式，将files[]中的元素，一个一个的赋值给file
            for (File file : files) {
                // 判断每一个file是否是目录还是文件
                // 如果是目录，重新执行该方法
                if (file.isDirectory()) {
                    listDirectory(file);// 此题的重点，自己调用自己
                    // 如果是文件，直接打印出来。
                } else {
                    LOG.info(file);
                }
            }
        }
    }

    // 以下是错误的方法
    @Test
    public void test() {
        String pathname = "E:\\eclipse";
        File file = new File(pathname);
        if (file.exists()) {// 查看file文件是否存在
            if (file.isFile()) {// 如果是文件
                LOG.info("名称是：" + file.getName());// 如果是文件，直接获取名字
            }
            if (file.isDirectory()) {// 此文件是目录
                // LOG.info("此文件是目录");
                String[] str = file.list();// 调用list()方法，将该目录下的文件和目录返回到String数组中
                for (int i = 0; i < str.length; i++) {
                    if (file.isDirectory()) {
                        for (int j = 0; j < str.length; j++) {
                            LOG.info(str[j]);
                        }
                    } else {
                        // LOG.info(str);
                    }
                }
            }
        } else {
            LOG.info("文件不存在");
        }
    }
}
