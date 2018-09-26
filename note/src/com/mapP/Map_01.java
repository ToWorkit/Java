package com.mapP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * 面试题:HashMap和Hashtable的区别
 *  1.Hashtable是JDK1.0版本出现的,是线程安全的,效率低,有加锁(看原码)[很少用]
 *  2.HashMap是JDK1.2版本出现的,是线程不安全的,效率高
 *  3.Hashtable不可以存储null键和null值
 *  4.HashMap可以存储null键和null值
 */

public class Map_01 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        // put(k, v) 添加元素
        //  存在键则替换值返回上一个值，没有则返回null
        // System.out.println(hashMap.put("name", "lp"));

        hashMap.put("name", "pp");
        hashMap.put("age", "20");
        hashMap.put("mex", "xx");

        // clear() 清除所有
        // remove(k) 根据k清除 元素(k,v都没了)
        hashMap. remove("mex");
        System.out.println(hashMap);

        // containsKey(k) 判断键
        boolean b = hashMap.containsKey("name");
        System.out.println(b);
        // containsValue(v) 判断值
        boolean b1 = hashMap.containsValue("20");
        System.out.println(b1);

        // isEmpty() 判断集合是否为空
        System.out.println(hashMap.isEmpty());

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "lp");
        // 自动装箱为 int -> Integer
        map.put("age", 12);
        // char -> Character
        map.put("gender", '女');
        // float -> Float
        map.put("height", 1.80);

        // get(k) 获取值
        System.out.println(map.get("name"));

        // keySet() 获取所有的键(集合类型)
        // class java.util.HashMap$KeySet
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        // values() 获取所有的值(集合类型)
        // class java.util.HashMap$Values
        Collection<Object> values = map.values();
        System.out.println(values);
        System.out.println(values.toArray()[0]);

        // size() 长度
        System.out.println(map.size());
    }
}
