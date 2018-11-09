package com.yanchao.designpatterns.observer.eventDriven;

/**
 * Created by Administrator on 2017/3/6.
 * 按钮双击的事件源
 */
public class DoubleClickEvent extends ButtonEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DoubleClickEvent(Object source) {
        super(source);
    }
}
