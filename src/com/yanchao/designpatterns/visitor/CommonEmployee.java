package com.yanchao.designpatterns.visitor;

/**
 * Created by Administrator on 2016/1/21.
 */
public class CommonEmployee extends Employee{
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
