/**
 * Project Name:DT59
 * File Name:FindMax.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午4:52:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午4:52:07 <br/>
 * 
 * @author WEN LIU
 * @version @see 编写一个方法，传入两个数值，返回较大的一个值；
 */
public class FindMax {

    public static void main(String[] args) {
        // 创建FindMax类的对象
        FindMax fm = new FindMax();
        // 从键盘输入
        Scanner sc = new Scanner(System.in);
        // 友好提示
        System.out.println("请输入2个数字： ");
        // 定义2个变量来接收键盘输入
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 调用getMax()方法，获取到较大值。
        int result = fm.getMax(a, b);
        // 打印找到的较大值
        System.out.println("2个数字较大的是：" + result);
        // 关闭scanner
        sc.close();
    }

    int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            System.out.println("两数相等");
            return a;
        }
    }

}
