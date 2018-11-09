package com.yanchao.designpatterns.Proxy.mybatisInterceptor;

/**
 * Created by Administrator on 2017/2/24.
 */
@MethodName("execute")
public class InterceptorImpl implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("execute Interceptor");
        return invocation.proceed();
    }

    @Override
    public Object register(Object target) {
        return TargetProxy.getTarget(target, this);
    }
}
