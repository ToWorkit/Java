package com.CollectionP;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_01 {
    public static void main(String[] args) {
        /**
         * Vector 是同步的
         */
        Vector vector = new Vector();

        // 添加元素
        /**
         * synchronized 同步
         *  加锁的意思，表示线程是安全的,但是性能较低
         */
        vector.addElement("一");
        vector.addElement("二");
        vector.addElement("三");

        // 取值
        System.out.println(vector.elementAt(2));

        // 遍历
        /**
         * enum是一个关键字(枚举)
         */
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            Object o = elements.nextElement();
            System.out.println(o);
        }

    }
}
