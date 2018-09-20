package com.objectP;

import java.math.BigInteger;

public class BigInteger_01 {
    public static void main(String[] args) {
        // BigInteger 可以让超过Integer范围内的数据进行运算
/*        int maxValue1 = Integer.MAX_VALUE;
        long maxValue = Long.MAX_VALUE;*/

        BigInteger bigInteger = new BigInteger("2147483647");
        BigInteger bigInteger1 = new BigInteger("2147483647");

        BigInteger sum = bigInteger.add(bigInteger1);
        System.out.println(sum);
    }
}
