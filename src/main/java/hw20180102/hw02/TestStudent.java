/**
 * Project Name:DT59
 * File Name:TestStudent.java
 * Package Name:hw20180102.hw02
 * Date:2018年1月2日下午6:56:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.hw02;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午6:56:35 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class TestStudent {
    public static void main(String[] args) {
        // 创建学生类对象
        Student stu = new Student("张三", 1001);
        // 使用多态，创建圆的对象，传入到父类中
        GeometricObject geometric1 = new Circle(10);
        // 调用学生类的方法，求出面积
        System.out.println(stu.calculate(geometric1));
        // 使用多态，创建矩形的对象，传入到父类中
        GeometricObject geometric2 = new MyRectangle(10, "白色", 10, 3);
        // 调用学生类的方法，求出面积
        System.out.println(stu.calculate(geometric2));
    }
}
