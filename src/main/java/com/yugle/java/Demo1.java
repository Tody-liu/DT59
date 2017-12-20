/**
 * Project Name:DT59
 * File Name:Demo1.java
 * Package Name:com.yugle.java
 * Date:2017年12月20日下午6:35:54
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package com.yugle.java;

/**
 * Description: <br/>
 * Date: 2017年12月20日 下午6:35:54 <br/>
 * 
 * @author liuwen
 * @version
 * @see
 */
public class Demo1 {

    public static void main(String[] args) {
        int[] array = new int[] { 13, 15, 4, 8, 56, 98, 78 };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // 遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
