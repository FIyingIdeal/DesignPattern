package com.yanchao.designpatterns.observer.eventDriven;

import java.util.EventObject;

/**
 * Created by Administrator on 2017/3/6.
 */
public abstract class ButtonEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ButtonEvent(Object source) {
        super(source);
    }

    @Override
    public Button getSource() {
        return (Button)super.getSource();
    }
}
