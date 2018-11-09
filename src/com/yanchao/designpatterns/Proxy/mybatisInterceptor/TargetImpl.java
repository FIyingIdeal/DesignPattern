package com.yanchao.designpatterns.Proxy.mybatisInterceptor;

/**
 * Created by Administrator on 2017/2/24.
 */
public class TargetImpl implements Target {
    @Override
    public void execute() {
        System.out.println("TargetImpl execute()");
    }

    @Override
    public void execute1() {
        System.out.println("TargetImpl execute1()");
    }
}
