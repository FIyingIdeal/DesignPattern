package com.yanchao.designpatterns.action.first;

/**
 * @author yanchao
 * @date 2018/3/13 14:30
 * @function 请求者角色，负责调用命令对象执行请求
 */
public class Keypad {

    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play() {
        this.playCommand.execute();
    }

    public void rewind() {
        this.rewindCommand.execute();
    }

    public void stop() {
        this.stopCommand.execute();
    }
}
