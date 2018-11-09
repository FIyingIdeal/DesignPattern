package com.yanchao.designpatterns.state.vote;

/**
 * Created by Administrator on 2017/2/20.
 */
public interface VoteState {
    /**
     * @param username 投票人
     * @param voteItem 投票项目
     * @param manager  投票上下文，用来在实现状态对应的功能处理的时候，可以回调上下文的数据
     */
    void vote(String username, String voteItem, VoteManager manager);
}
