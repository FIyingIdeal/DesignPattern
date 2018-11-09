package com.yanchao.designpatterns.state.elevator;

/**
 * @author yanchao
 * @date 2018/1/3 9:51
 */
public class CloseState extends ElevatorState {

    @Override
    public void open() {
        super.context.setState(ElevatorContext.openState);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关门");
    }

    @Override
    public void run() {
        super.context.setState(ElevatorContext.runState);
        super.context.run();
    }

    @Override
    public void stop() {

    }
}
