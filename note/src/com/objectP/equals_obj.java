package com.objectP;

/**
 * == 比较运算符号，既可以比较基本数据类型也可以比较引用数据类型，
 *  基本数据类型比较的是值，引用数据类型比较的是地址值
 *
 * equals方法，只能比较引用数据类型，所有对象都会继承Object类中的方法，
 *  如果没有重写Object类中的equals方法，equals方法和 == 比较引用数据类型无区别，
 *  重写后的equals方法比较的是对象中的属性
 */
public class equals_obj {
    public static void main(String[] args) {
        // 判断字符串是否包含哪个字符串(不忽略大小写)
        String s1 = "I Love You";
        System.out.println(s1.contains("Love"));
        // startsWith 以什么开头
        // endsWith 以什么结尾
        // isEmpty 是否为空
    }
}
