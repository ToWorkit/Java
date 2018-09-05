package com.company;

public class private_01 {
    public static void main(String[] args) {
        Student lo = new Student();
        lo.name = "Lo";
        // 私有属性，外部不可以直接访问
        // lo.age = 1;
        lo.setAge(20);
        lo.speak();

        System.out.println(lo.getAge());
    }
}

class Student {
    String name;
    private int age;

    // 修改年龄后在main方法中有可能会用到，所以对外提供获取的方法名(只读),注意返回值
    public int getAge() {
        return age;
    }

    // 需要对age进行校验并且要求校验的方式对外不可见，所以将age设置为private(私有的),只对外提供校验的方法名
    public void setAge(int _age) {
        if (_age > 0 && _age < 200) {
            // int 默认值为 0
            age = _age;
        } else {
            System.err.println("年龄范围错误");
        }
    }

    public void speak() {
        System.out.println(name + "," + age);
    }
}