package com.yanchao.designpatterns.composite.generic;

/**
 * Created by Administrator on 2017/3/10.
 */
public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public void operation() {
        //TODO 可以提供默认的实现方式，在子类中不满足要求可进行重写
        System.out.println(this.name);
    }
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int index);
}
