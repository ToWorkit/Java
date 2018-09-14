package com.string_p;

public class StringBuffer_02 {
    public static void main(String[] args) {
        /**
         * append 将任意类型数据 添加到 字符串缓冲区 里面，并返回字符串缓冲区本身
         *
         * insert 在 指定位置 将任意类型的数据 插入到 字符串缓冲区里，返回字符串缓冲区本身
         */

        StringBuffer sb = new StringBuffer();
        StringBuffer sb_1 = sb.append("Hello");
        System.out.println(sb.equals(sb_1)); // true hashCode地址一致

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, " lp");
        System.out.println(sb);

        /**
         *  deleteCharAt    删除指定位置的字符，并返回自身
         *
         *  delete  删除从指定位置开始到指定位置结束的内容，并返回自身(含头不含尾)
         */

        sb.deleteCharAt(6);
        System.out.println(sb);

        sb.delete(5, 7);
        System.out.println(sb);
    }
}
