/**
 * Project Name:DT59
 * File Name:Student.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午4:28:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午4:28:14 <br/>
 * @author   WEN LIU
 * @version
 * @see
 */
/**
 * 4) 编写一个抽象类，并定义一个抽象方法，再编写一个实现类，继承该抽象类； <br/>
 * Description: <br/>
 * date: 2017年12月29日 下午4:28:18 <br/>
 *
 * @author WEN LIU
 * @version
 */
/**
 * abstract：抽象的，可以用来修饰类、方法 <br/>
 * 1.abstract修饰类：抽象类 <br/>
 * ①不可被实例化 <br/>
 * ②抽象类有构造器 (凡是类都有构造器)<br/>
 * ③抽象方法所在的类，一定是抽象类。<br/>
 * ④抽象类中可以没有抽象方法。 <br/>
 * 当我们设计一个类，不需要创建此类的实例时候，就可以考虑将其设置为抽象的，由其子类实现这个类的抽象方法以后，就行实例化<br/>
 * 
 * 2.abstract修饰方法：抽象方法<br/>
 * ①格式：没有方法体，包括{}.如：public abstract void eat();<br/>
 * ②抽象方法只保留方法的功能，而具体的执行，交给继承抽象类的子类，由子类重写此抽象方法。<br/>
 * ③若子类继承抽象类，并重写了所有的抽象方法，则此类是一个"实体类",即可以实例化<br/>
 * ④若子类继承抽象类，没有重写所有的抽象方法，意味着此类中仍有抽象方法，则此类必须声明为抽象的！<br/>
 * 
 */
public class Student extends Human {

    @Override
    // 抽象方法，必须在子类中重写
    public String show() {

        return "我是一个牛批的人";
    }

}
