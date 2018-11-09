package com.yanchao.designpatterns.state.elevator;

/**
 * @author yanchao
 * @date 2018/1/3 10:08
 */
public class Client {

    public static void main(String[] args) {
        ElevatorContext context = new ElevatorContext();
        context.setState(ElevatorContext.stopState);
        context.open();
        context.close();
        context.run();
    }
}
