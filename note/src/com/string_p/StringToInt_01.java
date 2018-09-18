package com.string_p;

public class StringToInt_01 {
    public static void main(String[] args) {
        // int 转 String
        int a  = 10;

        String s = a + "";

        String s1 = String.valueOf(a);

        Integer integer = new Integer(a);
        String s2 = integer.toString();

        String s3 = Integer.toString(a);

        // 打印运行时的类型
        System.out.println(s3.getClass() + " " + s3);

        // String 转 int
        String str = "20";

        Integer integer1 = new Integer(str);
        int b = integer1.intValue();

        int c = Integer.parseInt(str);
        System.out.println(c + " " + b);
    }
}
