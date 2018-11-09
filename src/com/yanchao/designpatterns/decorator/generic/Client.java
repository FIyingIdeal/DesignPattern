package com.yanchao.designpatterns.decorator.generic;

/**
 * Created by Administrator on 2017/3/13.
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecoratorA(component);
        component = new ConcreteDecoratorB(component);
        component.operation();
    }
}
