/**
 * Project Name:DT59
 * File Name:Employee.java
 * Package Name:hw20180102.hw03
 * Date:2018年1月2日下午7:42:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.hw03;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午7:42:58 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class Employee {
    private String name;

    private int age;

    public Employee() {
        super();
    }

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void use(Printer printer) {
        printer.print();
    }

    public Printer getPrinter(int typeId) {
        Printer printer = null;
        if (typeId == 1) {
            printer = new DotMatrixPrinter();
        } else if (typeId == 2) {
            printer = new Inkpetprinter();
        }
        return printer;
    }
}
