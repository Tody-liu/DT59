/**
 * Project Name:DT59
 * File Name:Work3.java
 * Package Name:hw20180106
 * Date:2018年1月7日下午2:59:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180106;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午2:59:32 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class Work3 {
    public static void main(String[] args) throws Exception {
        Long start = System.currentTimeMillis();
        Date date = new Date();
        // 把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy
        String str = date.toString();
        System.out.println(str);
        Long end = System.currentTimeMillis();
        System.out.println("程序耗费的时间是： " + (end - start) + " 毫秒");

        // SimpleDateFormat:日期--->文本 使用SimpleDateFormat的format()方法
        // 方式一：
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        String date1 = sdf1.format(new Date());
        System.out.println(date1);// 18-1-7 下午3:39

        // 方式二：
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        date1 = sdf2.format(new Date());
        System.out.println(date1);// 星期日, 7 一月 2018 15:39:57 +0800

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        date1 = sdf3.format(new Date());
        System.out.println(date1);// 02018.一月.07 公元 03:39 下午

        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        date1 = sdf4.format(new Date());
        System.out.println(date1);// 2018.01.07 公元 at 15:41:17 CST

        // SimpleDateFormat:文本--->日期 使用SimpleDateFormat的parse()方法
        // 调用此方法的SimpleDateFormat对象
        // Date date2 = sdf4.parse("18-1-7 下午3:24");
        Date date3 = sdf2.parse("星期日, 7 一月 2018 15:39:57 +0800");
        System.out.println(date3);
    }
}
