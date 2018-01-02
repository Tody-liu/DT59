/**
 * Project Name:DT59
 * File Name:HomeWork1.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:21:26
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:21:26 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */

// 根据题目的要求（以父类作为方法形参实现多态，以父类作为方法返回值实现多态）
// 这2种方式，不了解具体的应用场景。
// 多态理解清楚，但是加上这2种方式，有点晕，不知道为啥有这2种方式。
public class HomeWork1 {
    /**
     * 熟悉理解多态应用场景，列举三个以上，格式如： <br/>
     * 父类：宠物类 Pet <br/>
     * 子类：狗类 Dog，猫类Cat； <br/>
     * 多态的方法（eat）：各子类的不同实现,狗吃骨头，猫吃鱼
     */

    /**
     * (一) 父类：几何图形GeometricObject <br/>
     * 子类：长方形MyRectangle，圆形Circle <br/>
     * 多态的方法（findArea）：各子类的不同实现 ,长方形（长*宽），圆形（3.14*r*r） <br/>
     * 学生（张三）计算几何图形的面积，可以用形参的多态来写。
     */

    /**
     * (二) 父类：打印机类 Printer <br/>
     * 子类： 针式打印机类 DotMatrixPrinter , 喷墨打印机类 Inkpetprinter <br/>
     * 多态的方法print(): 各子类的不同实现 <br/>
     * 公司员工（李四）需要打印文件，选择打印机。（1.针式打印机 2.喷墨打印机）
     */

    /**
     * (三) 父类：人类Person <br/>
     * 子类： 男人 man ；女人 woman <br/>
     * 多态的方法walk(): 各子类的不同实现，男人(笔直的走路)，女人(窈窕的走路) <br/>
     */
}
