package com.yanchao.designpatterns.prototype.samplePrototype;

/**
 * Created by Administrator on 2017/3/7.
 */
public class Prototype implements Cloneable {
    private String name;
    private int age;
    private char sex;

    public Prototype(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void update() {
        this.name += "New";
        this.age += this.age;
        this.sex = this.sex == 'm' ? 'f' : 'm';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Prototype clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype)o;
    }

    public static void main(String[] args) {
        Prototype prototype = new Prototype("yan", 23, 'f');
        System.out.println(prototype);
        Prototype prototype1 = prototype.clone();
        System.out.println(prototype1);
        System.out.println(prototype == prototype1);
    }
}
