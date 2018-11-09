package com.yanchao.designpatterns.Proxy.mybatisInterceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/2/24.
 */
public class Client {
    public static void main(String[] args) {
        Interceptor interceptor = new InterceptorImpl();
        //Target proxy = (Target)TargetProxy.getTarget(new TargetImpl(), interceptor);
        Target proxy = (Target) interceptor.register(new TargetImpl());
        proxy.execute();
        System.out.println("------without Interceptor-----");
        proxy.execute1();
    }
}
