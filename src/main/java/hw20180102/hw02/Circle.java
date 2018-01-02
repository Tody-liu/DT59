/**
 * Project Name:DT59
 * File Name:Circle.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午6:29:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.hw02;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:29:56 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class Circle extends GeometricObject/* 圆形 */ {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;// 圆的面积计算
    }
}
