package com.yanchao.designpatterns.Proxy.mybatisInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * Created by Administrator on 2017/2/24.
 */
public class TargetProxy implements InvocationHandler {

    private Object target;
    private Interceptor interceptor;

    private TargetProxy(Object target, Interceptor interceptor) {
        this.target = target;
        this.interceptor = interceptor;
    }

    public static Object getTarget(Object source, Interceptor interceptor) {
        return Proxy.newProxyInstance(source.getClass().getClassLoader(),
                source.getClass().getInterfaces(), new TargetProxy(source, interceptor));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MethodName annotation = this.interceptor.getClass().getAnnotation(MethodName.class);
        if (Objects.isNull(annotation)) {
            throw new NullPointerException("The class " + this.interceptor.getClass().getName()
                    + " doesn't have an MethodName annotation!");
        }
        if (Objects.equals(annotation.value(), method.getName())) {
            return this.interceptor.intercept(
                    new Invocation(target, method, args));
        }
        Object obj = method.invoke(this.target, args);
        return obj;
    }
}
