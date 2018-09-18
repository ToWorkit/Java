package com.packageClass;

public class Integer_01 {
    public static void main(String[] args) {
        // 构造方法
        int a = 10;
        Integer integer = new Integer(a);
        String s = integer.toString();
        System.out.println(s);

        // 静态属性
        System.out.println("最小值int " + Integer.MIN_VALUE);
        System.out.println("最大值int " + Integer.MAX_VALUE);

        // 进制
        System.out.println(Integer.toBinaryString(8)); // 二进制 2 ^ 3
        System.out.println(Integer.toOctalString(9)); // 八进制
        System.out.println(Integer.toHexString(17)); // 十六进制
    }
}
