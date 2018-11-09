package com.yanchao.designpatterns.decorator.generic;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void decoratorMethod() {
        System.out.println("decoratorA");
    }

    @Override
    public void operation() {
        this.decoratorMethod();
        super.operation();
    }
}
