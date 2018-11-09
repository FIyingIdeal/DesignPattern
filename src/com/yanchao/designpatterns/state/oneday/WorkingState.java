package com.yanchao.designpatterns.state.oneday;

/**
 * Created by Administrator on 2017/2/20.
 */
public class WorkingState implements State {

    @Override
    public void handle(Context context) {
        System.out.println("工作");
    }
}
