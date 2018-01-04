/**
 * Project Name:DT59
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午12:58:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;
import org.junit.Test;

import hw20180103.LogDemo;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午12:58:04 <br/>
 * @author   WEN LIU
 * @version
 * @see
 */
/**
 * 列出String对象有哪些属性、方法，并写出使用示例（五个方法）
 */
public class StringDemo {

    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Test
    public void stringDemo2() {
        // 5.lastIndexOf(String str): int 返回指定子字符串在此字符串中最右边出现处的索引。
        String str = "ABCDABC";
        LOG.info(str.lastIndexOf("ABC"));// 4

        // 6.length(): int 返回字符串的长度
        LOG.info(str.length());// 7

        // 7.replace(char oldChar, char newChar) : String 返回一个新的字符串，它是通过用
        // newChar 替换此字符串中出现的所有 oldChar 得到的。
        LOG.info(str.replace('A', 'G'));// GBCDGBC

        // 8.
        // substring(int beginIndex) : String 指定开始索引，取开始索引到末尾的所有字符，作为一个新的子字符串
        // substring(int beginIndex, int endIndex)：String
        // 指定开始索引和结束索引，取之间的字符作为新的子字符串。注意这里不包含结束索引指定的字符。用数学上讲的就是[开始索引，结束索引)
        // 以上的2个方法都是，返回一个新字符串，它是此字符串的一个子字符串。
        LOG.info(str.substring(2));// CDABC
        LOG.info(str.substring(2, 5));// CDA

        // 9.toCharArray(): char[] 将此字符串转换为一个新的字符数组。
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            LOG.info(array[i]);
        }

        // 10.toString() :String 返回此对象本身（它已经是一个字符串！）
        // 未重写toString()方法，返回的就是地址值。一般在类里面，直接重写toString()方法。得到的结果就是我们想要的
        Person person = new Person("张三", 19);
        LOG.info(person);
        // 重写前的结果是： hw20180104.Person@71dac704
        // 重写后的结果是：Person [name=张三, age=19]

        // 11.trim() 返回字符串的副本，忽略前导空白和尾部空白。只能忽略首尾的空格，不能忽略字符串中间的空格。
        String str1 = " AB  BC  ";
        LOG.info(str1.trim());// AB BC

    }

    @Test
    public void stringDemo1() {
        String str = "ABCDEFG";
        // 1.charAr(int index):char 返回指定索引处的char值。
        // 注意，String类的索引是从0开始的
        LOG.info(str.charAt(2));// C

        // 2.compareTo(String anotherString):int 按字典顺序比较两个字符串
        // 比较的是字符串中各字符的 Unicode 值（目前用处不大，只做了解）
        String str1 = "A";
        String str2 = "B";
        // str1.compareTo(str2);
        // str1 在 str2 前，返回负整数。
        LOG.info(str1.compareTo(str2));// -1
        // str2 在 str1 后，返回正整数。
        LOG.info(str2.compareTo(str1));// 1

        // 3.concat(String str)：String 将指定字符串连接到此字符串的结尾
        // 连接2个字符。这个方法在MySQL中也见到过，要求掌握。
        LOG.info(str2.concat(str));// BABCDEFG

        // 4.equals(Object anObject) : boolean 将此字符串与指定的对象比较。
        String str3 = "AA";
        String str4 = "AA";
        String str5 = new String("AA");
        LOG.info(str3 == str4);// true
        LOG.info(str3.equals(str4));// true
        // 直接用==号，比较的是地址值。所以要使用equals()方法，比较地址值指向的具体内容。
        LOG.info(str3 == str5);// false
        LOG.info(str3.equals(str5));// true
    }

}

class Person {
    private String name;

    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
