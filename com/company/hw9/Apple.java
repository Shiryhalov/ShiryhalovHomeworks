package com.company.hw9;

import java.util.Objects;

public class Apple extends Fruit {

    public Apple(double weight, double price) {
        super(weight, price);
    }

    public Apple() {
    }

    @Override
    public double cost() {
        return getPrice() * getWeight();
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                '}';
    }
}
