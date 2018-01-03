/**
 * Project Name:DT59
 * File Name:Dog.java
 * Package Name:hw20180103.hw02
 * Date:2018年1月3日下午3:34:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103.hw02;

import org.apache.log4j.Logger;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:34:51 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */
public class Dog extends Animal implements AnimalBehavior {

    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Override
    public void Breathing() {
        LOG.info("呼吸空气的感觉真好");
    }

    @Override
    public void Eat() {
        LOG.info("主人给我骨头吃了");
    }

    @Override
    public void Swimming() {
        LOG.info("游泳的感觉真好");
    }

}
