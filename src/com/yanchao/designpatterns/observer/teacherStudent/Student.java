package com.yanchao.designpatterns.observer.teacherStudent;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/7/28.
 */
public class Student extends Observable implements Observer{

    private String action = "在听课";

    public void setAction(String action) {
        this.action = action;
        change();
    }

    protected void change() {
        System.out.println("学生改变动作：" + getAction());
        this.setChanged();
        this.notifyObservers();
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Teacher) {
            Teacher teacher = (Teacher)o;
            System.out.println("学生发现班主任" + teacher.getTeacherAction());
            setAction("听课");
        }
    }
}
