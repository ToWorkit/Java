package com.string_p;

public class StringBuffer_03 {
    public static void main(String[] args) {
        /**
         * replace(int start, int end, String str);
         *  从 start 到 end 使用 str 替换 (含头不含尾)
         */

        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        sb.replace(2, 4, "m");
        System.out.println(sb);
    }
}
