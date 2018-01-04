/**
 * Project Name:DT59
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:40:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;

import hw20180103.LogDemo;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:40:06 <br/>
 * 
 * @author WEN LIU
 * @version
 * @see
 */

public class MapDemo {

    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    @Test
    public void mapDemo1() {
        Map map = new HashMap();
        // 1.put(K key, V value)：将指定的值与此映射中的指定键关联
        map.put("张三", 88);
        map.put("李四", 78);
        map.put("王五", 80);
        map.put("赵六", 90);

        // 6. 修改.直接使用 put()方法，将原来的一对key-value覆盖。
        map.put("王五", 100);

        // 2.remove(Object key):如果存在一个键的映射关系，则将其从此映射中移除
        map.remove("李四");

        // 3.keySet() :返回此映射中包含的键的 Set 视图。
        // Set set = map.keySet();
        // for (Object obj : set) {
        // System.out.println(obj);
        // }

        Set keyset = map.keySet();
        // 遍历key值
        for (Object obj : keyset) {
            LOG.info(obj);
        }
        // Iterator iterator = keyset.iterator();
        // while (iterator.hasNext()) {
        // LOG.info(iterator.next());
        // }

        LOG.info("=============================");

        // 4.valuse():返回此映射中包含的值的 Collection 视图。
        Collection values = map.values();
        for (Object obj : values) {
            LOG.info(obj);
        }
        // Iterator iterator2 = values.iterator();
        // while (iterator2.hasNext()) {
        // LOG.info(iterator2.next());
        // }

        LOG.info("=============================");

        // 5.entrySet()：返回此映射中包含的映射关系的 Set 视图。
        // 方式一
        Set entryset = map.entrySet();
        Iterator iterator1 = entryset.iterator();
        while (iterator1.hasNext()) {
            LOG.info(iterator1.next());
        }
        // for (Object obj : entryset) {
        // LOG.info(entryset);
        // }

        LOG.info("*************************8");
        // 方式二
        Set keyset1 = map.keySet();
        for (Object obj : keyset1) {
            LOG.info(obj + "======>" + map.get(obj));
        }
    }
}
