package com.setP;

import com.genericP.Person;
import com.genericP.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * HashSet子类
 *  怎么存就怎么取
 *  内部实现是哈希表和链接列表
 */
public class LinkedHashSet_01 {
    public static void main(String[] args) {
        /**
         * HashSet 存取顺序是不一样的
         * LinkedHashSet 存取是一样的
         */

        // 打印数据是无序的
        // HashSet<Student> hashSet = new HashSet<>();

        // 有序的
        LinkedHashSet<Student> hashSet = new LinkedHashSet<>();


        hashSet.add(new Student("lp", 1));
        hashSet.add(new Student("pp", 2));
        hashSet.add(new Student("ll", 3));
        hashSet.add(new Student("pl", 4));

        for (Student student : hashSet) {
            System.out.println(student);
        }
    }
}
