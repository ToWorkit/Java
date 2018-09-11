package com.interfaceP;

public class interface_01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}

interface AInterface {
    // 接口中的方法都是抽象的，必须重写
    public void eat();
}

// 实现接口
class Cat implements AInterface {
    @Override
    public void eat() {

    }
}