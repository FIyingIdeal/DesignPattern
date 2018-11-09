package com.yanchao.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/21.
 */
public class VisitorTest {
    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        for (Employee e : getEmployee()) {
            e.accept(visitor);
        }
    }

    private static List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setName("张三");
        zhangsan.setSex(Employee.MALE);
        zhangsan.setSalary(500);
        zhangsan.setJob("Java开发");

        Manager manager = new Manager();
        manager.setName("领导");
        manager.setSex(Employee.FEMALE);
        manager.setSalary(10000);
        manager.setPerformance("业绩极佳");

        employees.add(zhangsan);
        employees.add(manager);
        return employees;
    }
}
