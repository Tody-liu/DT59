/**
 * Project Name:DT59
 * File Name:TestTypeDefaultValue.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:04:58
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:04:58 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/*
 * 10.1 编写一个类TypeDefaultValue，并定义十个属性，前八个属性分别定义为8种基本数据类型；
 * 最后两属性类型分别定义为String和int[];编写另一个类TestTypeDefaultValue，
 * 定义main方法，在main方法，输出TypeDefaultValue类对象的每一个属性值；观察每种类型属性， <br/>
 * 默认值是什么，并以注释的形式在属性前说明。
 */
public class TestTypeDefaultValue {

    public static void main(String[] args) {
        TypeDefaultValue tdv = new TypeDefaultValue();
        System.out.println(tdv.b);
        System.out.println(tdv.s);
        System.out.println(tdv.i);
        System.out.println(tdv.l);
        System.out.println(tdv.f);
        System.out.println(tdv.d);
        System.out.println(tdv.c);
        System.out.println(tdv.b1);
        System.out.println(tdv.name);
        System.out.println(tdv.array);
    }

}
