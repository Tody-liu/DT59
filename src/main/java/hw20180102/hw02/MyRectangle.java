/**
 * Project Name:DT59
 * File Name:MyRectangle.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午6:32:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.hw02;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:32:29 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class MyRectangle extends GeometricObject/* 长方形 */ {
    private double width;

    private double height;

    public MyRectangle() {
        super();
    }

    public MyRectangle(double weight, String color, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return height * width;// 矩形的面积计算
    }
}
