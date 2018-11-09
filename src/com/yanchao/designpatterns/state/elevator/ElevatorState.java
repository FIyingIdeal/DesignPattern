package com.yanchao.designpatterns.state.elevator;

/**
 * @author yanchao
 * @date 2018/1/3 9:46
 * 抽象状态角色，负责对象状态定义，且封装环境角色以实现状态切换
 */
public abstract class ElevatorState {

    //环境角色，用于状态切换，声明为protected方便子类访问
    protected ElevatorContext context;

    public void setContext(ElevatorContext context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
