package com.genericP;

import com.CollectionP.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 通配符<?>
 * 2. ? extends E (E 是父类，? 是子类)
 * 3. ? super E
 */
public class Generic_04 {
    public static void main(String[] args) {
        // 1. 通配符<?>
        // 任意类型，没有明确，Object
        ArrayList<Object> list = new ArrayList<>();
        // 简写

        list.add(1);
        list.add("1");
        list.add(1.1);
        list.add(new Student());

        ArrayList<String> strings = new ArrayList<>();
        strings.add("2");
        // 静态方法直接调用
        echo(strings);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student());
        echo(students);
    }

    public static void echo(List<?> list) {
        System.out.println(list);
    }
}
