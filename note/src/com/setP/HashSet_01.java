package com.setP;

import java.util.HashSet;
import java.util.Random;

public class HashSet_01 {
    public static void main(String[] args) {
        // 使用HashSet存储随机数(保证数据唯一性)
        HashSet<Object> hashSet = new HashSet<>();
        // 随机数
        Random random = new Random();

        // 只存储10个
        while (hashSet.size() != 10) {
            // 1~20 之间的随机数
            int rd = random.nextInt(21);
            if (rd != 0) {
                hashSet.add(rd);
            }
        }

        System.out.println(hashSet);
    }
}
