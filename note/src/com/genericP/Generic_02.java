package com.genericP;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_02 {
    public static void main(String[] args) {
        // 当前类或者其子类都可以成为集合的元素
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Student("lp", 2));
        people.add(new Student("pp", 3));

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            // 需要重写toString方法
            System.out.println(iterator.next());
        }
    }
}
