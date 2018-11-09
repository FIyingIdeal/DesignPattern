package com.yanchao.designpatterns.action.first;

/**
 * @author yanchao
 * @date 2018/3/13 14:38
 */
public class RewindCommand implements Command {

    private AudioPlayer player;

    public RewindCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        this.player.rewind();
    }
}
