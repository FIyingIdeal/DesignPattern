package com.yanchao.designpatterns.Proxy.test1;

/**
 * Created by Administrator on 2017/2/23.
 */
public class TestClass implements TestInterface {

    @Override
    public void say(String name, int age) {
        System.out.println("Hello " + name + ", i = " + age);
    }

    @Override
    public void blame(String name) {
        System.out.println("Blame " + name);
    }
}
