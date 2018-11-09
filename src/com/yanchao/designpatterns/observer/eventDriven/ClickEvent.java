package com.yanchao.designpatterns.observer.eventDriven;

/**
 * Created by Administrator on 2017/3/6.
 * 按钮点击的时间源
 */
public class ClickEvent extends ButtonEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ClickEvent(Object source) {
        super(source);
    }
}
