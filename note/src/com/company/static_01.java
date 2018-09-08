package com.company;

public class static_01 {
    public static void main(String[] args) {
        /**
         * 1.静态方法里面不能访问非静态的成员变量和成员方法
         * 2.静态方法里面只能访问静态的成员变量和成员方法
         * 3.非静态方法可以访问静态的成员变量和成员方法
         */

        // 静态方法要是用 类名.属性 的方式访问
        Animal.age = 20;

        // 非静态属性需要实例化后访问
        Animal cat = new Animal();
        cat.name = "阿尔法";
        // 非静态方法需要使用实例化后的对象去访问
        cat.msg();

        // 类的静态方法可以直接访问
        Animal.speak();


        // 4.如果一个类中所有的方法都是静态的,需要私有构造方法,目的是不让其他类创建本类对象, 因为内部的方法都可以使用 类名.方法名 来使用，不需要new实例化(浪费性能)
        // new 的时候实际上是创建无参的构造方法(和类名相同的方法)，可以使用私有化来防止new
//        Animal cat = new Animal();


        // 如果调用静态方法属于同一个类的，类名可省略
        System.out.println(static_01.add(1, 2));
        System.out.println(add(1, 2));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}


class Animal {

    // 私有化，防止new
//    private Animal() {}

    // 非静态属性
    String name;
    // 静态属性
    static int age;

    // 对象方法(非静态)
    public void msg() {
        // 可以访问静态和非静态的属性以及方法
        System.out.println(name + "," + age);
    }

    public static void sleep() {
        // 静态方法中无法访问非静态属性(没有this关键字)
        /**
         * 因为静态方法会先于对象而加载
         * 静态是随着类的加载而加载，this是随着对象的创建(实例化之后)而存在
         */
//        System.out.println(this.name + "," + age);
        // 只能访问静态(属性和方法)
        System.out.println("多大 " + age);

        speak();
    }

    public static void speak() {
        System.out.println("嗯");
    }

}