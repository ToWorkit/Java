package com.interfaceP;

import java.util.ArrayList;

public class interface_02 {
    public static void main(String[] args) {
        /**
         * 删除元素
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("d");

        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).equals("c")) {
                // 删除元素(只能删除一个)
                // 因为删除后 i(查找索引)没有变 但是数据的索引往前进了一步
                list.remove("c");
                // 索引减一解决
                i--;
            }
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
