package com.yanchao.designpatterns.action.first;

/**
 * @author yanchao
 * @date 2018/3/13 14:25
 * @function 命令执行/接收者，负责具体实施和执行一个请求
 */
public class AudioPlayer {

    public void play() {
        System.out.println("AudioPlayer play()");
    }

    public void rewind() {
        System.out.println("AudioPlayer rewind()");
    }

    public void stop() {
        System.out.println("AudioPlayer stop()");
    }
}
