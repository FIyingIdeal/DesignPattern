package com.yanchao.designpatterns.observer.eventDriven;

/**
 * Created by Administrator on 2017/3/6.
 * 鼠标滑动的事件源
 */
public class MouseMoveEvent extends ButtonEvent {

    private int x;
    private int y;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MouseMoveEvent(Object source, int x, int y) {
        super(source);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
