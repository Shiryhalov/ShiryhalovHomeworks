package com.company.hw15;


import com.company.hw8.Animal;
import java.io.Serializable;

public class Generic<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public Generic(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }

    public void showType() {
        System.out.println("ob1: " + getOb1().getClass().getName());
        System.out.println("ob2: " + getOb2().getClass().getName());
        System.out.println("ob3: " + getOb3().getClass().getName());
    }

    public static void main(String[] args) {
        Generic<String, Animal, Number> object1 = new Generic<>("dsfsa", new Animal(), 13);
        object1.showType();
    }
}
