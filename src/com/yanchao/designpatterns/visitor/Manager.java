package com.yanchao.designpatterns.visitor;

/**
 * Created by Administrator on 2016/1/21.
 */
public class Manager extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
