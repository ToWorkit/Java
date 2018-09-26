package com.mapP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 	1.Map.Entry理解成"键值对对象"
 * 	2.Map.Entry是一个接口，它的实现类是HashMap$Node
 * 	3.Map.Entry是有个key和value属性，通过get方法可以取值
 * 	4.遍历Entry的两种方法，通过迭代器和for增强
 */
public class Map_02 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "lp");
        // 自动装箱为 int -> Integer
        map.put("age", 12);
        // char -> Character
        map.put("gender", '女');
        // float -> Float
        map.put("height", 1.80);

        // 遍历 可用 for

        // 迭代器
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        // for
        for (Map.Entry<String, Object> entry : entries) { // 局部作用域 entry
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
        System.out.println("---------");

        // 迭代器
        Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            System.out.println(entry.getKey() + "**" + entry.getValue());
        }
    }
}
