package com.objectP;

/**
 * String 字符串这个类重写了object的equals
 * 重写后的比较规则，两个字符串的每一个字符是否一样，有一个字符不一样就返回false
 */
public class equals_string {
    public static void main(String[] args) {
        // 比较字符串
        test();
    }

    private static void test() {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";
        System.out.println("s1 " + s1.hashCode());
        System.out.println("s2 " + s2.hashCode());
        System.out.println("s3 " + s3.hashCode());

        // 比较两个字符串是否相等
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true
    }
}
