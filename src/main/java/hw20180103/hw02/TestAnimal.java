/**
 * Project Name:DT59
 * File Name:TestAnimal.java
 * Package Name:hw20180103.hw02
 * Date:2018年1月3日下午3:42:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.hw02;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:42:35 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class TestAnimal {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.Breathing();
        a1.Eat();
        if (a1 instanceof Dog) {
            ((Dog) a1).Swimming();
        }

        Animal a2 = new Rabbit();
        a2.Breathing();
        a2.Eat();
        if (a2 instanceof Dog) {
            ((Dog) a2).Swimming();
        }
    }
}
