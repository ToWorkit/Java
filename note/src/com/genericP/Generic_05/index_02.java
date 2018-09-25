package com.genericP.Generic_05;

import com.CollectionP.Student;

import java.util.ArrayList;
import java.util.List;

public class index_02 {
    public static void main(String[] args) {
        // 使用Dao
        DaoInterface<Student> stuDao = new StudentDao();
        System.out.println(stuDao.findList());

        EmployeeDao employeeDao = new EmployeeDao();
        System.out.println(employeeDao.findList());
    }
}

/**
 * 数据访问层的接口
 *  接口内定义方法
 */

interface DaoInterface<T> {
    // 查找表的所有信息
    public List<T> findList();

    // 根据名字查询信息
    public T findByName(String name);

    // 修改信息
    public void update(T t);

}

// 泛型接口的实现类
class StudentDao implements DaoInterface<Student> {

    @Override
    public List<Student> findList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("lp", 11));
        return students;
    }

    @Override
    public Student findByName(String name) {
        return null;
    }

    @Override
    public void update(Student student) {

    }
}

class EmployeeDao implements DaoInterface<Employee> {

    @Override
    public List<Employee> findList() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("pp", 22));
        return employees;
    }

    @Override
    public Employee findByName(String name) {
        return null;
    }

    @Override
    public void update(Employee employee) {

    }
}