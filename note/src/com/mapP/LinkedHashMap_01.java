package com.mapP;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_01 {
    public static void main(String[] args) {
        /**
         * LinkedHashMap底层是链表实现的可以保证怎么存就怎么取
         * HashMap是存的和取的顺序是不一样的
         */

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("name", "lp");
        // 自动装箱为 int -> Integer
        map.put("age", "12");
        // char -> Character
        map.put("gender", "女");
        // float -> Float
        map.put("height", "1.80");

        // 遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}
