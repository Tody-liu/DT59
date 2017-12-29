/**
 * Project Name:DT59
 * File Name:LuxuryCar.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午4:06:42
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import hw20171228.Car;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:06:42 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class LuxuryCar extends Car {

    private int price;// 豪车的价格

    private String quality;// 豪车质量

    @Override
    public String summary() {

        return "我是豪车，" + "车的名字是" + this.getName() + "车的轮子是： " + this.getWheel();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
