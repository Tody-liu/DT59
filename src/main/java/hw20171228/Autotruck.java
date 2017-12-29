/**
 * Project Name:DT59
 * File Name:Autotruck.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午2:47:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午2:47:35 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class Autotruck extends Car {// 卡车类
    private String color;// 卡车颜色

    private int truckDoor;// 卡车门

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTruckDoor() {
        return truckDoor;
    }

    public void setTruckDoor(int truckDoor) {
        this.truckDoor = truckDoor;
    }

    public void show() {
        System.out.println("我是一辆牛批的卡车！");
    }

}
