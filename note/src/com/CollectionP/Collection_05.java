package com.CollectionP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection_05 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection coll = new ArrayList();
        // 添加元素
        coll.add("java");
        coll.add("scala");
        coll.add("javaScript");
        coll.add("c");
        coll.add("c++");
        coll.add("python");

        // List
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        // 在指定的位置插入元素
        list.add(1, "e");
        System.out.println(list);
        // 删除指定索引的元素
        // remove

        // 获取指定索引的元素
        // get

        // 替换指定索引的元素
        // set

        
    }
}
