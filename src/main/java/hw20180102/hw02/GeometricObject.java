/**
 * Project Name:DT59
 * File Name:GeometricObject.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午6:15:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.hw02;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午6:15:25 <br/>
 * @author   WEN LIU
 * @version
 * @see
 */

/**
 * (一) 父类：几何图形GeometricObject <br/>
 * 子类：长方形MyRectangle，圆形Circle <br/>
 * 多态的方法（findArea）：各子类的不同实现 ,长方形（长*宽），圆形（3.14*r*r） <br/>
 * 学生（张三）计算几何图形的面积，可以用形参的多态来写。
 */
public class GeometricObject {
    private String color;

    private double weight;

    public GeometricObject() {
        super();
    }

    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0;// 此方法要求子类重写。几何图形，不知道具体的面积计算公式，这里暂时返回0.
    }
}
