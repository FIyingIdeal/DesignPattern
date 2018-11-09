package com.yanchao.designpatterns.observer.eventDriven;

import java.util.EventListener;

/**
 * Created by Administrator on 2017/3/6.
 */
public interface MouseMoveListener extends EventListener {
    void mouseMove(MouseMoveEvent event);
}
