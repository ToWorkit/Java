package com.objectP;

public class object_01 {
    public static void main(String[] args) {
        Student stu = new Student("xx", 12);
        // 默认会调用Object的toString方法
        /**
         * 4554617c 由对象的hashCode的值转成16进制表示
         */
        System.out.println(stu); // com.objectP.Student@4554617c
        System.out.println(stu.hashCode()); // 1163157884
        System.out.println(stu.hashCode() + " , " + Integer.toHexString(stu.hashCode()));

        // 重写toString方法
        System.out.println(stu.toString());

        // 重写equals方法
        Student stu1 = new Student("x", 10);
        Student stu2 = new Student("x", 11);
        Student stu3 = new Student("x", 10);

        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(stu3));
    }
}

class Student {
    private String name;
    private String country;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 默认父类比较的是两个对象的地址
        // return super.equals(obj);

        // 1. 将 obj 还原为 Student
        Student other = (Student)obj;
        // 2. 比较两个对象的年龄和名字是否一样
        return this.age == other.age && this.name.equals(other.name);
    }
}
