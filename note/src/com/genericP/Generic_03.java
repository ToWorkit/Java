package com.genericP;

/**
 * 声明泛型类和方法
 */
public class Generic_03 {
    public static void main(String[] args) {
        // 创建
        /**
         * 表示 Tool 类只对 String 类型数据做操作
         */
        Tool<String> tool = new Tool<String>();
        tool.echo("test");
        // 泛型属性值操作
        tool.setValue("Hello World");
        System.out.println(tool.getValue());

        /**
         * Student
         */
        Tool<Student> studentTool = new Tool<>();
        studentTool.echo(new Student("pl", 5));
    }
}

/**
 * 泛型参数 <> 值不作要求，表占位的意思
 *  可以有多个，逗号隔开
 */
class Tool<T> {

    // 泛型变量
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // 声明泛型方法
    public void echo(T t) {
        System.out.println(t);
    }

    // 返回值类型
    public T get(int index) {
        return null;
    }
}
