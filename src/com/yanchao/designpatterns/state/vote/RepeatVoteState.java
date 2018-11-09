package com.yanchao.designpatterns.state.vote;

/**
 * Created by Administrator on 2017/2/20.
 * 重复投票
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String username, String voteItem, VoteManager manager) {
        //do nothing，进行提示
        System.out.println("不可重复投票！");
    }
}
