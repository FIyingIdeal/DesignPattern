package com.yanchao.designpatterns.state.elevator;

/**
 * @author yanchao
 * @date 2018/1/3 9:47
 * 具体状态角色--电梯开门状态，该状态下，电梯只能关门，而不能运行和停止
 *
 *具体状态必须完成两个职责：
 *  1.本状态的行为管理--本状态要做的事情；
 *  2.趋向状态处理：本状态如何过度到其他状态；
 */
public class OpenState extends ElevatorState {

    @Override
    public void open() {
        System.out.println("电梯开门");
    }

    @Override
    public void close() {
        super.context.setState(ElevatorContext.closeState);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
