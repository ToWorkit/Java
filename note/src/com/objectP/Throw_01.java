package com.objectP;

public class Throw_01 {
    public static void main(String[] args) {
        int div = getDiv(1, 0);
        /**
         * finally
         * -1
         */
        System.out.println(div);
    }
    public static int getDiv(int a, int b) {
        int d = 0;
        try {
            d = a / b;
            return d;
        } catch (Exception e) {
            d = -1;
            return d;
        } finally {
            /**
             * 会在return之前执行
             */
            System.out.println("finally");
        }
    }
}
