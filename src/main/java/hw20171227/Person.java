/**
 * Project Name:DT59
 * File Name:Person.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:11:55
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:11:55 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/*
 * 10.2 编写一个类，定义几个属性，同时给属性赋值；再定义一个无参数构造方法，在构造方法中， <br/>
 * 
 * 首先输出各属性值到控制台，再给属性赋值；观察输出值内容。
 */
public class Person {

    String name = "张三";

    int age = 20;

    String nation = "China";

    public Person() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.nation);
        this.name = "李四";
        this.age = 21;
        this.nation = "America";
    }
}
