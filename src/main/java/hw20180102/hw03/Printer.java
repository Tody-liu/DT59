/**
 * Project Name:DT59
 * File Name:Printer.java
 * Package Name:hw20180102.hw03
 * Date:2018年1月2日下午7:16:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.hw03;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午7:16:23 <br/>
 * @author   WEN LIU
 * @version
 * @see
 */

/**
 * (二) 父类：打印机类 Printer <br/>
 * 子类： 针式打印机类 DotMatrixPrinter , 喷墨打印机类 Inkpetprinter <br/>
 * 多态的方法print(): 各子类的不同实现 <br/>
 * --公司员工（李四）需要打印文件，选择打印机。（1.针式打印机 2.喷墨打印机）
 */

// 打印机类
public abstract class Printer {
    private String trademark;// 商标、品牌

    private double weight;// 重量

    public Printer() {
        super();
    }

    public Printer(String trademark, double weight) {
        super();
        this.trademark = trademark;
        this.weight = weight;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 定义一个抽象打印方法，要求子类重写此方法。
    public abstract void print();

}
