package com.yanchao.designpatterns.adapter.objectAdapter;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void oldMethod() {
        this.adaptee.oldMethod();
    }

    @Override
    public void newMethod() {
        System.out.println("Adapter.newMethod()");
    }
}
