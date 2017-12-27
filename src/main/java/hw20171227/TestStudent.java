/**
 * Project Name:DT59
 * File Name:TestStudent.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:27:06
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:27:06 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/*
 * 10.3. 编写一个类，定义几个属性，再定义一个带参构造方法，（参数包括所有属性）；<br/>
 * 再定义一个类，定义main方法，构造前一个类的实例对象，输出其属性值；
 */
public class TestStudent {

    public static void main(String[] args) {
        Student stu = new Student(2017, "张三", 20);
        System.out.println("学号： " + stu.id + "\n姓名： " + stu.name + "\n年龄： " + stu.age);

    }

}
