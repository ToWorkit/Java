package com.company;

public class test {
    public static void main(String[] args) {
        /**
         * i 局部变量，执行完成会释放掉
         */
        for (int i = 0; i < 3; i ++) {
            System.out.println(i);
        }
        // 报错
        // System.out.println(i);

        /**
         * 局部代码块
         */
        {
            int a = 1;
            System.out.println(a);
        }
        // Cannot resolve symbol 没找到无法解析
        // System.out.println(a);
    }
}
