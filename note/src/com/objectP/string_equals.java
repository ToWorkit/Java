package com.objectP;

public class string_equals {
    public static void main(String[] args) {
        // 字符串比较
//        String username = "test";
        String username = null; // java.lang.NullPointerException
        String password = "123";

//        if (username.equals("1") && password.equals("2")) {

        // 避免空指针异常， 将字符串常量放在最前面
        if ("1".equals(username) && "2".equals(password)) {
            System.out.println("success");
        } else {
            System.out.println("over");
        }
    }
}
