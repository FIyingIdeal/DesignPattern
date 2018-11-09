package com.yanchao.designpatterns.adapter.classAdapter;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void newMethod() {
        System.out.println("Adapter.newMethod()");
    }
}
