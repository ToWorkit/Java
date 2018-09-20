package com.CollectionP;

public class collection_01 {
    public static void main(String[] args) {
        /**
         * 对象数组存储引用数据类型，存的是地址值
         * 弊端
         *  数据太多时无法灵活操作，可用性差
         * 使用集合
         */

        // 储存五个学生的信息到数组中，遍历数组，获取得到每一个学生的信息
        // 1. 创建学生对象
        Student a = new Student("a", 1);
        Student b = new Student("b", 2);
        Student c = new Student("c", 3);
        Student d = new Student("d", 4);
        Student e = new Student("e", 5);

        // 2. 对象存入数组 对象数组
        Student[] students = new Student[5]; // 对象数组
        students[0] = a;
        students[1] = b;
        students[2] = c;
        students[3] = d;
        students[4] = e;

        // 3. 遍历数组获取学生信息
        for (int i = 0; i < students.length; i ++) {
            Student student = students[i];
            System.out.println(student);
        }

    }
}
