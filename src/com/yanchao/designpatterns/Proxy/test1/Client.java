package com.yanchao.designpatterns.Proxy.test1;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/2/23.
 */
public class Client {
    public static void main(String[] args) {
        TestClass source = new TestClass();
        /*TestInterface proxy = (TestInterface) Proxy.newProxyInstance(
                source.getClass().getClassLoader(),
                source.getClass().getInterfaces(),
                new DynamicProxy(source)
        );*/
        TestInterface proxy = DynamicProxy.getProxyInstance(source);
        proxy.say("yanchao", 23);
        proxy.blame("aaaa");
    }
}
