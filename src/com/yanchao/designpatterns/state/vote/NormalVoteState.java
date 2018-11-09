package com.yanchao.designpatterns.state.vote;

/**
 * Created by Administrator on 2017/2/20.
 * 正常投票
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String username, String voteItem, VoteManager manager) {
        //记录投票信息
        manager.getVoteMap().put(username, voteItem);
        System.out.println("投票成功，感谢您的参与!");
    }
}
