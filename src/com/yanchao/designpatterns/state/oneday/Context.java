package com.yanchao.designpatterns.state.oneday;

/**
 * Created by Administrator on 2017/2/20.
 */
public class Context {
    private static final State weakupState = new WeakupState();
    private static final State workingState = new WorkingState();
    private static final State sleepingState = new SleepState();
    private State state = weakupState;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 这个状态模式其实并不能很好的说明问题，因为状态模式本身是为了消除if...else的，但这个方法还是需要通过if...else来进行状态的选择
     * @param hour
     */
    public void request(int hour) {
        if (hour >= 7 && hour < 9) {
            setState(weakupState);
        } else if (hour >= 9 && hour <= 18) {
            setState(workingState);
        } else {
            setState(sleepingState);
        }
        this.state.handle(this);
    }
}
