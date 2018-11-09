package com.yanchao.designpatterns.observer.teacherStudent;

/**
 * Created by Administrator on 2016/7/28.
 */
public class DemoTest {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.addObserver(teacher);
        teacher.addObserver(student);

        student.setAction("睡觉");
        student.setAction("玩手机");
        teacher.setTeacherAction("趴在窗户上");
    }
}
