package com.yanchao.designpatterns.action.first;

/**
 * @author yanchao
 * @date 2018/3/13 14:34
 */
public class Client {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        PlayCommand playCommand = new PlayCommand(player);
        RewindCommand rewindCommand = new RewindCommand(player);
        StopCommand stopCommand = new StopCommand(player);
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);
        keypad.play();
        keypad.rewind();
        keypad.stop();
    }
}
