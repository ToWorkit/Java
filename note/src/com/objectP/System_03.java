package com.objectP;

import java.util.Arrays;

public class System_03 {
    public static void main(String[] args) {
        // 时间 毫秒
        System.out.println(System.currentTimeMillis());

        /**
         * src -> source 源头
         * pos -> position 位置
         * dest -> destination 目标
         */
        // public static native void arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);

        int[] arr1 = {1, 2, 4, 1, 3};
        int[] arr2 = new int[3];
//        System.out.println(Arrays.toString(arr2)); // [0, 0, 0]
        System.arraycopy(arr1, 1, arr2, 0, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
