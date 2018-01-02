/**
 * Project Name:DT59
 * File Name:TestEmployee.java
 * Package Name:hw20180102.hw03
 * Date:2018年1月2日下午7:48:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.hw03;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午7:48:49 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择要使用的打印机类型：1、针式打印机 2、喷墨打印机");
        int typeId = scanner.nextInt();
        Printer printer = emp.getPrinter(typeId);
        emp.use(printer);
        scanner.close();
    }
}
