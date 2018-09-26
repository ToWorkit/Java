package com.setP;

import java.util.TreeSet;

/**
 * TreeSet存储自定义对象
 * 1.当TreeSet中添加自定义的对象时，会出现ClassCastException类型转换异常
 * 2.为什么？
 * 	 因为TreeSet在添加元素时，内部会把 自定义对象 转成 	Comparable
 * 3.为什么内部要转成Comparable
 *   Comparable是一个接口，这个接口用于指定排序规则
 * 4.当使用TreeSet添加自定义元素时，这个类需要实现Comparable接口
 *   并实现接口的compareTo方法
 *   当方法返回 0：只存第一个元素
 *            -1: 倒序存元素
 *             1：怎么加就怎么存
 */
public class TreeSet_02 {
    public static void main(String[] args) {
        TreeSet<Student_02> treeSet = new TreeSet<Student_02>();
        treeSet.add(new Student_02("嗯嗯", 12));
        treeSet.add(new Student_02("吼吼", 12));
        treeSet.add(new Student_02("嗯哈", 22));
        treeSet.add(new Student_02("好好", 22));

        for (Student_02 student : treeSet) {
            System.out.println(student);
        }
    }
}

class Student_02 implements Comparable<Student_02> {

    private String name;
    private int age;

    public Student_02() {
    }

    public Student_02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student_02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student_02 o) {
        // 重写方法
        // 1. 按照年龄的从小到大
        int num = this.age - o.age;
        System.out.println(this.name + "," + o.name + " 年龄差:" + num);

        // 如果年龄一样，则按照姓名进行排序
        if (num == 0) {
            // 返回值还是 0
            num = this.name.compareTo(o.name);
        }
        return num;
    }
}
