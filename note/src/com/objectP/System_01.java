package com.objectP;

public class System_01 {
    public static void main(String[] args) {
        // gc() 运行垃圾回收器
        for (int i = 0; i < 10; i ++) {
            new Student_02();
            // 创建一个对象就回收一个对象
            System.gc();
        }
    }
}


class Student_02 {

    // finalize 当对象从内存中消失时会调用该方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "从对象内存中消失了");
    }
}