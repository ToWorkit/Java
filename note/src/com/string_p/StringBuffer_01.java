package com.string_p;

public class StringBuffer_01 {
    public static void main(String[] args) {
        /**
         * StringBuffer 线程安全的可变字符序列
         *  内部实现是字符数组
         *  初始容量为16个字符
         * StringBuffer和String的区别
         *  String是一个不可变的字符序列
         *  StringBuffer是一个可变的字符序列
         *  StringBuffer是线程安全，可以加锁
         */

        StringBuffer sb = new StringBuffer();
        // 内部字符数组的初始容量
        System.out.println(sb.capacity()); // 容量 16
        System.out.println(sb.length()); // 长度 0
    }
}
