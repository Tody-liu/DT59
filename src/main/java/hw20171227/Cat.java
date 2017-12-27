/**
 * Project Name:DT59
 * File Name:Cat.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:48:03
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:48:03 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/*
 * 10.6. 编写一个类，定义两个属性，其中一个属性前添加static关键字；再定义两个方法，
 * 
 * 其中一个方法前添加static关键字；再编写一个类，定义main方法，
 * 在main方法中，分别输出前一个类的两个属性，以及调用两个方法；注意观察不同处，并写上注释
 */
public class Cat {
    String name;

    static String kind;

    public void catch1() {
        System.out.println("捉老鼠");
    }

    public static void eat() {
        System.out.println("我爱吃鱼");
    }
}
