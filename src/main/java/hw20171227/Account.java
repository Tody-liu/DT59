/**
 * Project Name:DT59
 * File Name:Account.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:32:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:32:00 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/*
 * 10.4. 编写一个类，定义三个以上属性，并定义三个构造方法；再编写一个类，定义main方法，
 * 
 * 用三种方式构造前一个类的实例对象；
 */
public class Account {
    private int id;// 银行账户

    private double balance;// 银行存款

    private double annualInterestRate;// 银行利率

    // 以下3个方法构成重载。
    // 构造方法重载，会讲默认的空参构造器
    public Account(int id) {
        super();
        this.id = id;
    }

    public Account(int id, double balance) {
        super();
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate) {
        super();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void show() {
        int id = 0;
        System.out.println(id);
    }
}
