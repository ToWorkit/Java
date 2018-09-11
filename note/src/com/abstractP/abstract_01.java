package com.abstractP;

public class abstract_01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/*使用抽象类练习员工的案例
			假如我们在开发一个系统时需要对 “程序员类” 进行设计
			程序员包括3个属性:姓名，工号以及工资
			项目经理，除了含有程序员的属性外，另外还有一个奖金属性
			请使用继承的思想设计出程序员和经理类，要求类中提供必要的方法进行属性访问*/

        Programmer programmer = new Programmer("小郭", "JAVA10001", 10000);
        programmer.say();

        System.out.println("===========================");

		/*ProjectManager manager = new ProjectManager("小刘", "JAVA10000", 20000);
		manager.bonuses = 30000;*/
        ProjectManager manager = new ProjectManager("小刘", "JAVA10000", 20000,30000);
        manager.say();
    }

}

abstract class Employee{
    String name;
    String id;// 工号
    double salary;// 工资

    public abstract void say();


    public Employee(String name, String id, double salary) {
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }



    public Employee() {
        super();
    }


}

/**
 * program:程序
 * programmer:程序员
 * */

class Programmer extends Employee{

    @Override
    public void say() {
        System.out.println("我是" + name);
        System.out.println("我的工号是" + id);
        System.out.println("我的月薪" + salary);
    }

    public Programmer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Programmer(String name, String id, double salary) {
        super(name, id, salary);
        // TODO Auto-generated constructor stub
    }


	/*public Programmer(String name,String id,double salary){
		super(name, id, salary);
	}
	*/


}

class ProjectManager extends Employee{

    double bonuses;

    @Override
    public void say() {
        // TODO Auto-generated method stub
        System.out.println("我是" + name);
        System.out.println("我的工号是" + id);
        System.out.println("我的月薪" + salary);
        System.out.println("我的奖金" + bonuses);
    }

    public ProjectManager() {
        super();
    }

    public ProjectManager(String name, String id, double salary) {
        super(name, id, salary);
    }

    public ProjectManager(String name, String id, double salary,double bonuses) {
        super(name, id, salary);// 调用Employee的构造方法
        this.bonuses = bonuses;
    }
}

