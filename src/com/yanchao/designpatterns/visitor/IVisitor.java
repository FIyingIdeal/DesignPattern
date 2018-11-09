package com.yanchao.designpatterns.visitor;

/**
 * Created by Administrator on 2016/1/21.
 */
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);
    public void visit(Manager manager);
}
