package com.yanchao.designpatterns.action.first;

/**
 * @author yanchao
 * @date 2018/3/13 11:50
 */
public class PlayCommand implements Command {

    private AudioPlayer player;

    public PlayCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
