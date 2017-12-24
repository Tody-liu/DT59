/**
 * Project Name:DT59
 * File Name:Pet.java
 * Package Name:com.yugle.java
 * Date:2017年12月24日下午7:39:20
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package com.yugle.java;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午7:39:20 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class TestPet {

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.name = "小燕子";
        pig.age = 3;
        pig.weight = 60;
        System.out.println("宠物的名字是： " + pig.name);
        System.out.println("宠物的年龄是： " + pig.age + "岁");
        System.out.println("宠物的体重是： " + pig.weight + "kg");
        pig.eat();
        pig.sleep();
        pig.run();
    }

}

class Pig {
    String name;

    int age;

    int weight;

    void eat() {
        System.out.println("我是一头小猪猪，我爱吃饭！");
    }

    void sleep() {
        System.out.println("我是一头小猪猪，我吃饱了就睡觉！");
    }

    void run() {
        System.out.println("我是一头小猪猪，我吃饱了睡足了要出去运动了！");
    }
}
