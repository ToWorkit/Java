package com.setP;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        // 一行
        String line = sc.nextLine();

        // class java.lang.String
        // System.out.println(line.getClass());

        // 输入结果是字符串需要转为字符数组
        char[] chars = line.toCharArray();

        // Character char的包装类
        HashSet<Character> hashSet = new HashSet<>();
        // 遍历添加， 利用set特性过滤掉重复字符
        for (char aChar : chars) {
            // 会自动装箱
            hashSet.add(aChar);
        }

        System.out.println(hashSet);

        // 应该写为Character，发生了自动拆箱
        for (char character : hashSet) {
            System.out.println(character);
        }
    }
}
