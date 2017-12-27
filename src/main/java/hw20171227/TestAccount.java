/**
 * Project Name:DT59
 * File Name:TestAccount.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:34:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:34:04 <br/>
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
public class TestAccount {

    public static void main(String[] args) {
        // 根据不同的构造方法，构造出3个不同的实例对象
        Account acc = new Account(1001);

        Account acc1 = new Account(1001, 20000);

        Account acc2 = new Account(1001, 20000, 0.0123);
    }
}
