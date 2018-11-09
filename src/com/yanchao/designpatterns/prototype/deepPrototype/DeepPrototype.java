package com.yanchao.designpatterns.prototype.deepPrototype;

/**
 * Created by Administrator on 2017/3/7.
 * 深拷贝，被clone的对象A1中如果含有一个其他对象的引用B1，则这个引用B1也会被拷贝成一个新的对象，
 * 即拷贝生成的A2对象中的B2与A1中的B1是两个不同的对象，即 B1 != B2
 */
public class DeepPrototype implements Cloneable {
    private String deepString;
    private int deepInt;
    private DeepField deepField;

    public DeepPrototype(String deepString, int deepInt) {
        this.deepInt = deepInt;
        this.deepString = deepString;
        this.deepField = new DeepField("yyy", 23, 'f');
    }

    public String getDeepString() {
        return deepString;
    }

    public void setDeepString(String deepString) {
        this.deepString = deepString;
    }

    public int getDeepInt() {
        return deepInt;
    }

    public void setDeepInt(int deepInt) {
        this.deepInt = deepInt;
    }

    public DeepField getDeepField() {
        return deepField;
    }

    public void setDeepField(DeepField deepField) {
        this.deepField = deepField;
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "deepString='" + deepString + '\'' +
                ", deepInt=" + deepInt +
                ", deepField=" + deepField +
                '}';
    }


    public DeepPrototype clone() {
        Object o = null;
        try {
            o = super.clone();
            ((DeepPrototype)o).deepField = (this.deepField.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (DeepPrototype)o;
    }

    public static void main(String[] args) {
        DeepPrototype deepPrototype = new DeepPrototype("deep", 33);
        System.out.println(deepPrototype);
        DeepPrototype deepPrototype1 = deepPrototype.clone();
        System.out.println(deepPrototype1);
        System.out.println(deepPrototype.getDeepField() == deepPrototype1.getDeepField());    //false，深拷贝
    }
}
