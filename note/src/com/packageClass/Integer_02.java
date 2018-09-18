package com.packageClass;

public class Integer_02 {
    public static void main(String[] args) {
        // 自动装箱(将基本类型转换为包装类类型)
        Integer i = 10; // 内部会自动new Integer(10)

        // 自动拆箱(将包装类类型转为基本类型)
        Integer i2 = new Integer(100);
        int a = i2; // 内部会自动 i2.intValue()

    }
}
