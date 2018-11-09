package com.yanchao.designpatterns.Proxy.test0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/2/23.
 */
public class DynamicProxy implements InvocationHandler {

    private Object source;

    public DynamicProxy(Object source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("接口的方法全部变成这样了");
        //由于被代理类没有实现接口，所以需要通过反射方式来获取该类里与接口中同名的方法。比较啰嗦~
        Method method1 = source.getClass().getMethod(method.getName(), method.getParameterTypes());
        return method1.invoke(source, args);
    }

    public static void main(String[] args) {
        TestInterface object = (TestInterface)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{TestInterface.class}, new DynamicProxy(new TestClass()));
        object.method1();
        object.method2();
        object.method3();
    }
}
