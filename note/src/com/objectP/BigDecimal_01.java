package com.objectP;

import java.math.BigDecimal;

public class BigDecimal_01 {
    public static void main(String[] args) {
        /**
         * BigDecimal
         *  运算的时候float类型和double很容易丢失精度, 所以计算浮点数时使用BigDecimal, 特别是金融公司
         */
        System.out.println(2.0 - 1.1);

        BigDecimal bigDecimal = new BigDecimal("2.0");
        BigDecimal bigDecimal1 = new BigDecimal("1.1");

        // + 运算
        BigDecimal sum = bigDecimal.add(bigDecimal1);
        System.out.println(sum);

        // -
        BigDecimal subtract = bigDecimal.subtract(bigDecimal1);
        System.out.println(subtract);

        // *
        BigDecimal multiply = bigDecimal.multiply(bigDecimal1);
        System.out.println(multiply);
        // /
        /**
         * 除法运算需要两个数能被除尽，不然会报 no exact 的错误(不准确)
         */
        BigDecimal bigDecimal2 = new BigDecimal("2.0");
        BigDecimal bigDecimal3 = new BigDecimal("0.5");
        BigDecimal divide = bigDecimal2.divide(bigDecimal3);
        System.out.println(divide);
    }
}
