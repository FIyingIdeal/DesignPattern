package com.yanchao.designpatterns.decorator.generic;

/**
 * Created by Administrator on 2017/3/13.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("原始operation方法");
    }
}
