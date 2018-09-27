package com.mapP;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_01 {
    public static void main(String[] args) {
        /**
         *  1.Collection 与 Collections 区别
         * 	  Collection 是一个接口
         * 	  Collections 是一个类
         * 	2.Collections 的作用针对集合操作 的工具类
         * 	3.Collections 成员方法
         * 		public static <T> void sort(List<T> list) 排序
         * 		public static <T> int binarySearch(List<?> list,T key) 二分查找
         * 		public static <T> T max(Collection<?> coll)
         * 		public static void reverse(List<?> list)
         * 		public static void shuffle(List<?> list)
         */

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(0);
        integers.add(4);
        integers.add(1);

        // 排序
/*        Collections.sort(integers);
        System.out.println(integers);*/

        // 二分查找
        System.out.println(Collections.binarySearch(integers, 2));

        // 洗牌
        Collections.shuffle(integers);
        System.out.println(integers);
    }
}
