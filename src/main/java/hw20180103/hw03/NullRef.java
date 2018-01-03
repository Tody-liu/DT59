/**
 * Project Name:DT59
 * File Name:NullRef.java
 * Package Name:hw20180103.hw03
 * Date:2018年1月3日下午3:55:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.hw03;

import org.apache.log4j.Logger;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:55:41 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see 3．编写一个空指针异常代码，并用try..catch处理<br>
 *      4．在第3题的代码中，添加日志输出：<br>
 *      （1）输出代码中的变量数据值；<br>
 *      （2）输出异常信息<br>
 * 
 */
public class NullRef {

    // 以下注释的代码报错：
    // Exception in thread "main" java.lang.NullPointerException
    // at hw20180103.hw03.NullRef.main(NullRef.java:27)

    // int i = 1;
    // public static void main(String[] args) {
    // NullRef t = new NullRef();
    // t = null;
    // System.out.println(t.i);
    // }

    int i = 1;

    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {
        try {
            NullRef t = new NullRef();
            t = null;
            LOG.info((t.i));
        } catch (Exception e) {
            /**
             * 异常有点不理解。 按照我的理解，try-catch-finally 和 throws 还有 throw 不知道何时用哪种。<br>
             * 后期还是需要大量的题目来巩固与温习。
             * 
             * 2018-01-03 16:06:44,973 [main] INFO [hw20180103.LogDemo] -
             * java.lang.NullPointerException at
             * hw20180103.hw03.NullRef.main(NullRef.java:44)
             */
            LOG.info(e.getMessage());
            e.printStackTrace();
        }
    }
}
