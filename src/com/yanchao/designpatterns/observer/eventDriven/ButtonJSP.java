package com.yanchao.designpatterns.observer.eventDriven;

/**
 * Created by Administrator on 2017/3/6.
 */
public class ButtonJSP {
    private Button button;

    public ButtonJSP() {
        this.button = new Button();
        button.setId("buttonId");
        button.setName("buttonName");
        button.setOnClick(new ClickListener() {
            @Override
            public void click(ClickEvent event) {
                System.out.println("单击了按钮" + button.getName());
            }
        });

        button.setDoubleClick(new DoubleClickListener() {
            @Override
            public void doubleClick(DoubleClickEvent event) {
                System.out.println("双击了按钮" + button.getName());
            }
        });

        button.setMouseMove(new MouseMoveListener() {
            @Override
            public void mouseMove(MouseMoveEvent event) {
                System.out.println("鼠标所在位置(" + event.getX() + "," + event.getY() + ")");
            }
        });
    }

    public Button getButton() {
        return button;
    }
}
