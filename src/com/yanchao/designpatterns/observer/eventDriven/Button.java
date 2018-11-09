package com.yanchao.designpatterns.observer.eventDriven;

/**
 * Created by Administrator on 2017/3/6.
 * 模仿html中的Button按钮
 */
public class Button {

    private String id;          //Button的id属性
    private String name;        //name属性
    private ClickListener onClick;  //相当于onclick
    private DoubleClickListener doubleClick;
    private MouseMoveListener mouseMove;

    public void onClick() {
        onClick.click(new ClickEvent(this));
    }

    public void doubleClick() {
        doubleClick.doubleClick(new DoubleClickEvent(this));
    }

    public void mouseMove(int x, int y) {
        mouseMove.mouseMove(new MouseMoveEvent(this,x, y));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClickListener getOnClick() {
        return onClick;
    }

    //相当于给onClick添加函数
    public void setOnClick(ClickListener onClick) {
        this.onClick = onClick;
    }

    public DoubleClickListener getDoubleClick() {
        return doubleClick;
    }

    public void setDoubleClick(DoubleClickListener doubleClick) {
        this.doubleClick = doubleClick;
    }

    public MouseMoveListener getMouseMove() {
        return mouseMove;
    }

    public void setMouseMove(MouseMoveListener mouseMove) {
        this.mouseMove = mouseMove;
    }
}
