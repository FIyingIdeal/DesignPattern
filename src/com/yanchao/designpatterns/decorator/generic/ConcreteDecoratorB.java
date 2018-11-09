package com.yanchao.designpatterns.decorator.generic;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void decoratorMethod() {
        System.out.println("decoratorB");
    }

    @Override
    public void operation() {
        super.operation();
        this.decoratorMethod();
    }
}
