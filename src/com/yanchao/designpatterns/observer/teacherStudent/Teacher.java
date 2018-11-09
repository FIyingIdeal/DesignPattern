package com.yanchao.designpatterns.observer.teacherStudent;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/7/28.
 */
public class Teacher extends Observable implements Observer {

    private String teacherAction;

    public void setTeacherAction(String teacherAction) {
        this.teacherAction = teacherAction;
        change();
    }

    protected void change() {
        this.setChanged();
        this.notifyObservers();
    }

    public String getTeacherAction() {
        return this.teacherAction;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Student) {
            Student student = (Student)o;
            System.out.println("老师观察到学生改变动作 : " + student.getAction());
        }
    }
}
