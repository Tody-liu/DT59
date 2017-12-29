/**
 * Project Name:DT59
 * File Name:SedanCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午2:47:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午2:47:09 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class SedanCar extends Car {// 小汽车类
    private String color;// 小车的颜色

    private int carDoor;// 小车的门

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarDoor() {
        return carDoor;
    }

    public void setCarDoor(int carDoor) {
        this.carDoor = carDoor;
    }

    public void show() {
        System.out.println("我是一辆牛批的小轿车！");

    }

    public void info() {
        // this.setName("兰博基尼");
        // this.setWheel(4);
        String name = this.getName();
        int wheel = this.getWheel();
        // this.setCarDoor(4);
        int carDoor = this.getCarDoor();
        // this.setColor("黄色");
        String color = this.getColor();
        System.out.println(
                "我的名字是： " + name + "我的轮子个数是：" + wheel + " 个" + "\n我的颜色是： " + color + " 我有 " + carDoor + " 个轮子");
    }

}
