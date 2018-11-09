package com.yanchao.designpatterns.composite.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/10.
 */
public class Composite extends Component {
    //private String name;
    private List<Component> components;

    public Composite(String name) {
        //this.name = name;
        super(name);
        components = new ArrayList<>();
    }

    @Override
    public void operation() {
        //可根据业务逻辑选择重写该方法
        System.out.print("This is composite:");
        super.operation();
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return this.components.get(index);
    }

    public List<Component> getComponents() {
        return this.components;
    }
}
