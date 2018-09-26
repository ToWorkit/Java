package com.setP;


/**
 * TreeSet存储自定义对象
 * 1.当TreeSet中添加自定义的对象时，会出现ClassCastException类型转换异常
 * 2.为什么？
 * 	 因为TreeSet在添加元素时，内部会把Person 转成 	Comparable
 * 3.为什么内部要转成Comparable
 *   Comparable是一个接口，这个接口用于指定排序规则
 * 4.当使用TreeSet添加自定义元素时，这个类需要实现Comparable接口
 *   并实现接口的compareTo方法
 *   当方法返回 0：只存第一个元素
 *            -1: 倒序存元素
 *             1：怎么加就怎么存
 */
public class TreeSet_02 {
    public static void main(String[] args) {

    }
}
