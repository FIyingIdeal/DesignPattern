package com.yanchao.designpatterns.visitor;

/**
 * Created by Administrator on 2016/1/21.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManager(manager));
    }

    private String getBasicInfo(Employee employee) {
        return employee.getName() + '\t'
                + (employee.getSex() == Employee.MALE ? "男" : "女") + '\t' + employee.getSalary() + '\t';
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = commonEmployee.getJob();
        return basicInfo + otherInfo;
    }

    private String getManager(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = manager.getPerformance();
        return basicInfo + otherInfo;
    }
}
