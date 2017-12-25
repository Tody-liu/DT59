/**
 * Project Name:DT59
 * File Name:VipCard.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:13:48
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:13:48 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class VipCard {
    String grade;

    // 通过输入，获取卡片等级信息
    String getCardInfo(int input) {
        if (input == 1) {
            // System.out.println("您的卡片是至尊级!");
            return "至尊级";
        } else if (input == 2) {
            // System.out.println("您的卡片是钻石级!");
            return "钻石级";
        } else if (input == 3) {
            // System.out.println("您的卡片是铂金级!");
            return "铂金级";
        } else if (input == 4) {
            // System.out.println("您的卡片是黄金级!");
            return "黄金级";
        } else if (input == 5) {
            // System.out.println("您的卡片是白银级!");
            return "白银级";
        } else {
            // System.out.println("您输入的信息有误");
            return null;
        }
    }

    // 将卡片信息和消费金额作为形参传入该方法
    double getBalance(String cardInfo, double expend) {
        double balance = 0;
        if (cardInfo.equals("至尊级")) {
            balance = 0.75 * expend;
        } else if (cardInfo.equals("钻石级")) {
            balance = 0.8 * expend;
        } else if (cardInfo.equals("铂金级")) {
            balance = 0.85 * expend;
        } else if (cardInfo.equals("黄金级")) {
            balance = 0.9 * expend;
        } else if (cardInfo.equals("白银级")) {
            balance = 0.95 * expend;
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VipCard vc = new VipCard();
        System.out.print("请选择卡片等级： ");
        // 定义a，来接收键盘输入
        int a = sc.nextInt();
        // 将a作为实参，传入getCardInfo()方法中，返回String类型的b
        String b = vc.getCardInfo(a);
        // System.out.println(b);
        // 显示顾客卡片等级
        System.out.println("您的卡片的级别是： " + b);
        System.out.print("请输入消费金额： ");
        double expend = sc.nextDouble();
        // 将从getCardInfo()方法中获取到的值，作为实参传入getBalance()方法中，从而获得最后的结算金额
        double balance = vc.getBalance(b, expend);
        System.out.println("您消费的总金额为： " + balance + " RMB");
        sc.close();
    }
}
