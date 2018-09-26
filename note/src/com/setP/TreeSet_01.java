package com.setP;

import java.util.TreeSet;

/**
 * 可用于排序的集合
 *  基于TreeMap的NavigableSet实现
 *  使用TreeSet存储自定义对象，自定义的对象必须要实现Comparable接口
 *  存储数字(由小到大)
 *  存储字符串(字母由小到大)
 */
public class TreeSet_01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(21);
        treeSet.add(43);
        treeSet.add(10);
        treeSet.add(1);

        for (Integer integer : treeSet) {
            /**
             * 1
             * 10
             * 21
             * 43
             */
            System.out.println(integer);
        }

        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("lucy");
        set2.add("tony");
        set2.add("abc");
        set2.add("amy");
        set2.add("cc");
        set2.add("banana");

        //遍历
        for(String name : set2){
            /**
             * abc
             * amy
             * banana
             * cc
             * lucy
             * tony
             */
            System.out.println(name);
        }
    }
}
