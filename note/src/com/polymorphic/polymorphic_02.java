package com.polymorphic;

public class polymorphic_02 {
    public static void main(String[] args) {

        /**
         * 成员方法: 编译看左边(父类)，运行看右边(子类)
         */

        // 父类引用指向子类对象
        Father_02 son2 = new Son_02();
        son2.eat();

    }
}

class Father_02 {
    int num = 10;

    public void eat() {
        System.out.println("吃鱼");
    }
}

class Son_02 extends Father_02 {
    int num = 20;

    // 子类没有会去找父类
    public void eat() {
        System.out.println("吃肉");
    }
}