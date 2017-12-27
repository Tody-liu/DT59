/**
 * Project Name:DT59
 * File Name:TestCat.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:51:15
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:51:15 <br/>
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
public class TestCat {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(cat.kind);
        // 静态方法，可以直接通过类名来调用，也可以通过对象名来调用。
        Cat.eat();
        // 普通方法，只能通过对象名来调用
        cat.catch1();

    }

}
