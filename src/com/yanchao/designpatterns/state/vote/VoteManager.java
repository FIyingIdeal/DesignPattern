package com.yanchao.designpatterns.state.vote;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/20.
 */
public class VoteManager {

    private VoteState voteState;

    //记录投票人及投票项目
    private Map<String, String> voteMap = new HashMap<>();

    //记录用户投票次数
    private Map<String, Integer> voteCount = new HashMap<>();

    public void vote(String username, String item) {
        Integer num = voteCount.get(username);
        if (num == null) {
            num = 0;
        }
        num += 1;
        voteCount.put(username, num);
        if (num == 1) {
            voteState = new NormalVoteState();
        } else if (num > 1 && num <5) {
            voteState = new RepeatVoteState();
        } else if (num >= 5 && num < 8) {
            voteState = new SpiteVoteState();
        }
        voteState.vote(username, item, this);
    }

    public Map<String, String> getVoteMap() {
        return this.voteMap;
    }
}
