package com.CollectionP;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_03 {
    public static void main(String[] args) {
        test01();

    }

    /**
     * 删除集合中的元素
     */
    private static void test01() {
        // 创建一个集合对象
        Collection coll = new ArrayList();
        // 添加元素
        coll.add("java");
        coll.add("scala");
        coll.add("javaScript");
        coll.add("c");
        coll.add("c++");
        coll.add("python");


        ArrayList  col2 = new ArrayList();
        col2.add("阿琪");
        col2.add("阿天");

        // 当集合col1的值改变时返回true
        boolean addAll = coll.addAll(col2);
        System.out.println(addAll);
        System.out.println(coll);
    }
}
