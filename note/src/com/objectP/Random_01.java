package com.objectP;

import java.util.Random;

public class Random_01 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i ++) {
            System.out.println(random.nextInt());
        }

        for (int i = 0; i <  10; i++) {
            // 0 - 9的随机数
            System.out.println(random.nextInt(10));
        }
    }
}
