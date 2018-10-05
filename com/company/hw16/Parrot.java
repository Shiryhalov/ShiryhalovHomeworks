package com.company.hw16;

import java.util.Objects;

public class Parrot extends Pet{
    private int height;

    public Parrot(String color, int weight, int age, int height) {
        super(color, weight, age);
        this.height = height;
    }

    public Parrot(String color, int weight, int age) {
        super(color, weight, age);
    }

    public Parrot() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return height == parrot.height;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "height=" + height +
                '}';
    }
}
