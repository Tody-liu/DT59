/**
 * Project Name:DT59
 * File Name:Rabbit.java
 * Package Name:hw20180103.hw02
 * Date:2018年1月3日下午3:39:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.hw02;

import org.apache.log4j.Logger;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:39:16 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class Rabbit extends Animal {// 兔子不会游泳，所以不能实现AnimalBehavior接口

    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Override
    public void Breathing() {
        LOG.info("呼吸空气的感觉真好");
    }

    @Override
    public void Eat() {
        LOG.info("胡萝卜真好吃");
    }

}
