package com.yanchao.designpatterns.state.elevator;

/**
 * @author yanchao
 * @date 2018/1/3 9:49
 * 环境角色：定义客户端需要的接口，并且负责具体状态的切换
 * 环境角色有两个不成文的约束：
 *      1.把状态对象声明为静态常量，有几个状态对象就声明几个静态常量；
 *      2.环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式；
 */
public class ElevatorContext {

    public static final OpenState openState = new OpenState();
    public static final CloseState closeState = new CloseState();
    public static final RunState runState = new RunState();
    public static final StopState stopState = new StopState();

    private ElevatorState state;

    public void setState(ElevatorState state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

    public void run() {
        this.state.run();
    }

    public void stop() {
        this.state.stop();
    }

}
