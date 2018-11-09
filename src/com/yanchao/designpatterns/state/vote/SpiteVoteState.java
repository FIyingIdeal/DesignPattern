package com.yanchao.designpatterns.state.vote;

/**
 * Created by Administrator on 2017/2/20.
 * 恶意投票
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String username, String voteItem, VoteManager manager) {
        //清除投票记录
        if (manager.getVoteMap().get(username) != null) {
            manager.getVoteMap().remove(username);
        }
        System.out.println("恶意行为，清除投票记录！");
    }
}
