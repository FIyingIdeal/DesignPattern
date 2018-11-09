package com.yanchao.designpatterns.state.elevator;

/**
 * @author yanchao
 * @date 2018/1/3 10:01
 */
public class RunState extends ElevatorState {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯运行");
    }

    @Override
    public void stop() {
        super.context.setState(ElevatorContext.stopState);
        super.context.stop();
    }
}
