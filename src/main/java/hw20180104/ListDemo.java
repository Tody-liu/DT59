/**
 * Project Name:DT59
 * File Name:ListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:08:57
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:08:57 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */

// List常用的方法：增(add(Object obj)) 删(remove) 改(set(int index,Object obj))
// 查(get(int index)) 插(add(int index, Object ele)) 长度(size())
public class ListDemo {

    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Test
    public void testList() {
        List list = new ArrayList();
        // 1.add(E e):向列表的尾部添加指定的元素
        list.add(123);
        list.add(456);
        list.add(new String("AA"));
        list.add(new String("GG"));

        // 2.contains(Object o) :如果列表包含指定的元素，则返回 true。
        LOG.info(list.contains("AA"));// true
        LOG.info(list.contains("BB"));// false

        // 3.size():返回列表中的元素数。
        LOG.info(list.size());// 4

        // 4.get(int index):返回列表中指定位置的元素
        // list中的索引，是从0开始的。
        LOG.info(list.get(2));// AA

        // 5.remove(int index):移除列表中指定位置的元素
        LOG.info(list.remove(2));// 删除AA

        LOG.info("=============================");

        // 6.iterator() :遍历list
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            LOG.info(iterator.next());
        }

        LOG.info("=============================");

        // 7.set(index, element)
        list.set(2, "MM");
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            LOG.info(iterator1.next());
        }

        LOG.info("=============================");
        // 8.add(int index, Object ele)
        list.add(2, "ZZ");
        Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            LOG.info(iterator2.next());
        }
    }
}
