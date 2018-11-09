package com.yanchao.designpatterns.Proxy.test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/2/23.
 */
public class DynamicProxy implements InvocationHandler {

    private Object source;

    /*public DynamicProxy(Object source) {
        this.source = source;
    }*/

    private DynamicProxy(Object source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //args是参数列表，应该与被代理对象方法中的参数数目及顺序一致
        Object obj = null;
        if (method.getName().equals("say")) {
            System.out.println("say proxy begin");
            obj = method.invoke(source, args);
            for (Object arg : args) {
                System.out.println(arg);
            }
            System.out.println("say proxy end");
        }

        if (method.getName().equals("blame")) {
            System.out.println("blame proxy begin");
            obj = method.invoke(source, args);
            System.out.println("blame proxy end");
        }
        return obj;
    }

    public static TestInterface getProxyInstance(TestInterface source) {
        return (TestInterface) Proxy.newProxyInstance(
                source.getClass().getClassLoader(),
                source.getClass().getInterfaces(),
                new DynamicProxy(source)
        );
    }

}
