/**
 * Project Name:DT59
 * File Name:Dog.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:40:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:40:12 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/*
 * 10.5. 编写一个类，定义几个属性，每个属性前添加private修饰符；
 * 
 * 为每个属性，添加get/set方法，方法前添加public修饰符；再编写一个类，
 * 定义main方法，在main方法中，构造前一个类的实例对象，并调用实例对象的set方法，
 * 
 * 设置对应数据值；最后调用get方法，输出对应属性值到控制台。
 */
public class Dog {
    private String name;

    private int age;

    private int legs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
