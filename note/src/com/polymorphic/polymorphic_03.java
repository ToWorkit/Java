package com.polymorphic;

public class polymorphic_03 {
    public static void main(String[] args) {

        /**
         * 静态方法: 编译看左边(父类)，运行看左边(父类), 不提倡
         */

        // 父类引用指向子类对象
/*        Father_03 son3 = new Son_03();
        son3.eat();*/

        Father_03.eat();

    }
}

class Father_03 {
    int num = 10;

    public static void  eat() {
        System.out.println("吃鱼");
    }
}

class Son_03 extends Father_03 {
    int num = 20;

    // 子类没有会去找父类
    public static void  eat() {
        System.out.println("吃肉");
    }
}
