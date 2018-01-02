/**
 * Project Name:DT59
 * File Name:Student.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午6:47:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.hw02;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:47:56 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see 定义学生类，来计算几何图形的面积
 */
public class Student/* 学生类 */ {
    private String name;// 学生姓名

    private int id;// 学生学号

    public Student() {
        super();
    }

    public Student(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // 计算几何图形的面积，以形参的形式。将GeometricObject以形参的形式传进去
    public double calculate(GeometricObject geometric) {
        return geometric.findArea();
    }

}
