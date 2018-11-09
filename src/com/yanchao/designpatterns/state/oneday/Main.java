package com.yanchao.designpatterns.state.oneday;

/**
 * Created by Administrator on 2017/2/20.
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        for (int i = 0; i <=24; i++) {
            context.request(i);
        }
    }
}
