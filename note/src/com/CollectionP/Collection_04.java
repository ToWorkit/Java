package com.CollectionP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_04 {
    public static void main(String[] args) {
        /**
         * hasNext()
         *  判断是否有下一个元素
         * next()
         *  获取下一个元素
         */

        // 创建一个集合对象
        Collection coll = new ArrayList();
        // 添加元素
        coll.add("java");
        coll.add("scala");
        coll.add("javaScript");
        coll.add("c");
        coll.add("c++");
        coll.add("python");
        // 获取迭代器
        Iterator iterator = coll.iterator();
        // 遍历
        while (iterator.hasNext()) { // 判断是否有下一个元素
            Object o = iterator.next();
            System.out.println(o);
        }
        System.out.println("-----");

        // 创建一个集合对象
        Collection col2 = new ArrayList();
        col2.add(new Student("阿天", 12));
        col2.add(new Student("阿浩", 13));
        col2.add(new Student("阿美", 11));
        Iterator iterator1 = col2.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
