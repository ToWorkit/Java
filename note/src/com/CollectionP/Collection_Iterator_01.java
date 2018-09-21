package com.CollectionP;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection_Iterator_01 {
    public static void main(String[] args) {
        /**
         * ListIterator
         *  适用于一边遍历元素，一边添加元素
         */

        // List遍历 size 获取长度，get取值
        List col2 = new ArrayList();
        col2.add("Hi");
        col2.add("Yarn");
        col2.add("Hello");
        col2.add("MapReduce");

        // 遍历
        ListIterator iterator = col2.listIterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            String str =  (String) o;
            if (str.equals("Hello")) {
                iterator.add("HDFS"); // [Hi, Yarn, Hello, HDFS, MapReduce]
            }
        }

        System.out.println(col2);
    }
}
