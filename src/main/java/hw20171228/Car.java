/**
 * Project Name:DT59
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午2:40:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午2:40:35 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */

/**
 * 1) 在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()，输出车的概要信息，<br/>
 * 再自由定义两个属性、两个方法；定义一个小汽车的类和大卡车的类，要求：a）继承车的抽象类,<br/>
 * b）分别定义一个以上的属性和方法<br/>
 * Description: <br/>
 * date: 2017年12月29日 下午4:17:07 <br/>
 *
 * @author WEN LIU
 * @version
 */
public abstract class Car {
    private String name;// 车的名字

    private int wheel;// 车的轮子数

    public String summary() {

        return "车的名字是" + this.name + "车的轮子是： " + this.wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
