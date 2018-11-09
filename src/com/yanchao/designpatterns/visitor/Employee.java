package com.yanchao.designpatterns.visitor;

/**
 * Created by Administrator on 2016/1/21.
 */
public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE = 1;

    private int salary;
    private String name;
    private int sex;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public abstract void accept(IVisitor visitor);
}
