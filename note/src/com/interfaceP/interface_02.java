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
                list.remove("c");
            }
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
