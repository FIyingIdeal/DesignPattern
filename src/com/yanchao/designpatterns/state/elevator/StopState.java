package com.yanchao.designpatterns.state.elevator;

/**
 * @author yanchao
 * @date 2018/1/3 10:02
 */
public class StopState extends ElevatorState {

    @Override
    public void open() {
        super.context.setState(ElevatorContext.openState);
        super.context.open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setState(ElevatorContext.runState);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
