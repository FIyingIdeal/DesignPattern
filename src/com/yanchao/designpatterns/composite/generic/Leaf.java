package com.yanchao.designpatterns.composite.generic;

/**
 * Created by Administrator on 2017/3/10.
 */
public class Leaf extends Component {
    //private String name;

    public Leaf(String name) {
        //this.name = name;
        super(name);
    }

    @Override
    public void operation() {
        //可根据业务逻辑选择重写该方法
        System.out.print("This is leaf :");
        super.operation();
    }

    @Deprecated
    public void add(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void remove(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public Component getChild(int index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
