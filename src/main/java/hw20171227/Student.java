/**
 * Project Name:DT59
 * File Name:Student.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:24:34
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:24:34 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/*
 * 10.3. 编写一个类，定义几个属性，再定义一个带参构造方法，（参数包括所有属性）；<br/>
 * 再定义一个类，定义main方法，构造前一个类的实例对象，输出其属性值；
 */
public class Student {
    int id;// 学号

    String name;// 学生姓名

    int age;// 学生年龄

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
