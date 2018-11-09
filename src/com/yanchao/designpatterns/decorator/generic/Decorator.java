package com.yanchao.designpatterns.decorator.generic;

/**
 * Created by Administrator on 2017/3/13.
 */
public class Decorator extends Component {

    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
