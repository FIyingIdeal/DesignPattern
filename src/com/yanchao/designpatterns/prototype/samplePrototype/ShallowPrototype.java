package com.yanchao.designpatterns.prototype.samplePrototype;

/**
 * Created by Administrator on 2017/3/7.
 * 浅拷贝，被clone的对象A1中如果含有一个其他对象的引用B1，则这个引用B1的内存地址会被拷贝，
 * 即拷贝生成的A2对象中的B2与A1中的B1指向同一个地址，即 B1 == B2
 */
public class ShallowPrototype implements Cloneable {
    private String shallowString;
    private int shallowInt;
    private ShallowField shallowField;

    public ShallowPrototype(String shallowString, int shallowInt) {
        this.shallowInt = shallowInt;
        this.shallowString = shallowString;
        this.shallowField = new ShallowField("yyy", 23, 'f');
    }

    public ShallowPrototype clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (ShallowPrototype)o;
    }

    public String getShallowString() {
        return shallowString;
    }

    public void setShallowString(String shallowString) {
        this.shallowString = shallowString;
    }

    public int getShallowInt() {
        return shallowInt;
    }

    public void setShallowInt(int shallowInt) {
        this.shallowInt = shallowInt;
    }

    public ShallowField getShallowField() {
        return shallowField;
    }

    public void setShallowField(ShallowField shallowField) {
        this.shallowField = shallowField;
    }

    @Override
    public String toString() {
        return "ShallowPrototype{" +
                "shallowString='" + shallowString + '\'' +
                ", shallowInt=" + shallowInt +
                ", field=" + shallowField +
                '}';
    }

    public static void main(String[] args) {
        ShallowPrototype shallowPrototype = new ShallowPrototype("shallow", 33);
        System.out.println(shallowPrototype);
        ShallowPrototype shallowPrototype1 = shallowPrototype.clone();
        System.out.println(shallowPrototype1);
        System.out.println(shallowPrototype.getShallowField() == shallowPrototype1.getShallowField());    //true，浅拷贝
    }
}
