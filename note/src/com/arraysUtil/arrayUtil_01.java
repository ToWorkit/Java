package com.arraysUtil;

import java.util.Arrays;

public class arrayUtil_01 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 0, 7};
        // 转为字符
        System.out.println(Arrays.toString(arr));
        // 排序(没有返回值)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 二分查找
        // 找不到元素则为负数，表示当前查找的数应该插入的位置
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 9));

        /*
            [3, 1, 5, 2, 0, 7]
            [0, 1, 2, 3, 5, 7]
            2
            -5
            -7
        */
    }
}
