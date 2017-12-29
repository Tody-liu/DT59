/**
 * Project Name:DT59
 * File Name:Human.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午4:23:40
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:23:40 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
/**
 * 4) 编写一个抽象类，并定义一个抽象方法，再编写一个实现类，继承该抽象类； <br/>
 * Description: <br/>
 * date: 2017年12月29日 下午4:27:51 <br/>
 *
 * @author WEN LIU
 * @version
 */
public abstract class Human {
    private int eyes;// 记录人的眼睛个数

    private int mose;// 记录人的鼻子个数

    private int mouth;// 记录人的嘴巴个数

    public abstract String show();// 抽象的show()方法。

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getMose() {
        return mose;
    }

    public void setMose(int mose) {
        this.mose = mose;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

}
