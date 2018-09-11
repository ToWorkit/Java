package com.objectP;

public class object_01 {
    public static void main(String[] args) {
        Student stu = new Student("xx", "china");
        // 默认会调用Object的toString方法
        /**
         * 4554617c 由对象的hashCode的值转成16进制表示
         */
        System.out.println(stu); // com.objectP.Student@4554617c
        System.out.println(stu.hashCode()); // 1163157884
        System.out.println(stu.hashCode() + " , " + Integer.toHexString(stu.hashCode()));

        // 重写toString方法
        System.out.println(stu.toString());
    }
}

class Student {
    private String name;
    private String country;

    public Student() {
        super();
    }

    public Student(String name, String country) {
        super();
        this.name = name;
        this.country = country;
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
}
