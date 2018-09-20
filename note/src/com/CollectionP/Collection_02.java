package com.CollectionP;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_02 {
    public static void main(String[] args) {
        /**
         * Collection
         *
         * 集合中部分数组的实现原理
         *      初始化数组有10个容量，不够时按照1.5倍增加新数组，同时将以前的数组垃圾回收掉
         *
         * List 有序集合，有索引，存与取的顺序一样，可以重复
         *      ArrayList
         *          数组实现
         *      LinkedList
         *          链表实现
         *      Vector
         *          数组实现
         *
         * Set  无序集合，无索引，存与取的顺序不一样，不可以重复
         *      HashSet
         *          哈希算法
         *      TreeSet
         *          二叉树算法
         */

        // 多态(接口指向实现类)
        // 创建一个集合对象
        Collection coll = new ArrayList();
        // 添加元素
        coll.add("java");
        coll.add("scala");
        coll.add("javaScript");
        coll.add("c");
        coll.add("c++");
        coll.add("python");

        System.out.println(coll); // [java, javaScript]

        // 移除
        coll.remove("javaScript");
        System.out.println(coll);

        // 清除所有元素
/*        coll.clear();
        System.out.println(coll);*/

        // 是否包含
        System.out.println(coll.contains("java"));

        // 是否为空
        System.out.println(coll.isEmpty());

        // 集合转数组遍历
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i ++) {
            System.out.println(objects[i]);
        }
    }
}
