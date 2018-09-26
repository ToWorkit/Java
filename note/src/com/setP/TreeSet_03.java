package com.setP;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_03 {
    public static void main(String[] args) {
        // 集合中存储了无序并且重复的字符串，让其有序(按照字典顺序)，而且不能去除重复
        TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                /**
                 * 倒叙
                 *  return o2 - o1;
                 */

                // 从小到大
                int num = o1.compareTo(o2);
                // 保留重复元素
                num = num == 0 ? 1 : num;
                return num;
            }
        });

        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("a");

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
