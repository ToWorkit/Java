package com.mapP;

import java.util.HashMap;

public class HashMap_01 {
    public static void main(String[] args) {
        // 统计字符串出现的次数
        String str = "1121sdsdsdqwwesd";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i ++) {
            char charAt = str.charAt(i);
            if (!map.containsKey(charAt)) {
                map.put(charAt, 1);
            } else {
                map.put(charAt, map.get(charAt) + 1);
            }
        }

        System.out.println(map);
    }
}
