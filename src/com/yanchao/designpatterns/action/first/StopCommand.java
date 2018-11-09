package com.yanchao.designpatterns.action.first;

/**
 * @author yanchao
 * @date 2018/3/13 14:40
 */
public class StopCommand implements Command {

    private AudioPlayer player;
    public StopCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        this.player.stop();
    }
}
