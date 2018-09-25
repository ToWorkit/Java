package com.genericP;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        // 遍历 (1)
        for (int i = 0; i < list.size(); i ++) {
            String value = list.get(i);
            System.out.println(value);
        }
        System.out.println("-----");
        // 迭代器 (2)
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
