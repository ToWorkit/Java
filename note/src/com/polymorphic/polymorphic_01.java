package com.polymorphic;

/**
 * 1.事物存在的多种形态
 * 2.多态的前提条件
 *      继承关系
 *      方法重写
 *      父类引用指向子类对象
 * 3.多态中的成员范围特点
 *      成员变量: 编译看左边(父类)，运行看左边(父类)
 */


public class polymorphic_01{
    public static void main(String[] args) {

        /**
         *  成员变量: 编译看左边(父类)，运行看左边(父类)
         */

        // 子类
        Son son1 = new Son();
        System.out.println(son1.num); // 20

        // 父类引用指向子类对象
        Father son2 = new Son();
        // 找父类的，父类没有就会报错
        System.out.print(son2.num); // 10

    }
}

class Father {
    int num = 10;
}

class Son extends Father {
    int num = 20;
}