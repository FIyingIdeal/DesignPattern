package com.yanchao.designpatterns.composite.generic;

/**
 * Created by Administrator on 2017/3/10.
 */
public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component c1 = new Composite("c1");
        Component c2 = new Composite("c2");
        Component c2c3 = new Composite("c3");

        Component l1 = new Leaf("l1");
        Component l2 = new Leaf("l2");
        Component rootl3 = new Leaf("l3");
        Component c4l4 = new Leaf("l4");

        root.add(c1); root.add(c2); root.add(rootl3);
        c1.add(l1);
        c2.add(l2); c2.add(c2c3); c2c3.add(c4l4);

        //root.operation();
        print(null, root);
    }

    public static void print(String prefix, Component component) {
        prefix = prefix == null ? "" : prefix;
        System.out.print(prefix);
        component.operation();
        if (component instanceof Composite) {
            Composite composite = (Composite)component;
            for (Component component1 : composite.getComponents()) {
                print(prefix + "--", component1);
            }
        }
    }
}
