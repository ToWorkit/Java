package com.upAnddownTransform;

public class transform_01 {
    public static void main(String[] args) {
        // 1. 基本数据类型转换
        int a = (int)3.14;
        System.out.println(a);

        // 2. 向上转型(子类对象赋值给父类对象)(父类指向子类对象)
        Person p = new SupperMan();

        // 3. 向下转型
        SupperMan sm = (SupperMan) p; // 强制类型转换
        // 上面的 p 实际指向的是SupperMan
        sm.fly();
    }
}

class Person{
    public void run() {
        System.out.println("跑");
    }
}

class SupperMan extends Person {
    public void fly() {
        System.out.println("飞");
    }
}