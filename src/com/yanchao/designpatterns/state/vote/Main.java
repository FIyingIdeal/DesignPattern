package com.yanchao.designpatterns.state.vote;

/**
 * Created by Administrator on 2017/2/20.
 */
public class Main {
    public static void main(String[] args) {
        VoteManager manager = new VoteManager();
        for (int i = 0; i <= 8; i++) {
            manager.vote("haha", "1");
        }
    }
}
