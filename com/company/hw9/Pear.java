package com.company.hw9;

import java.util.Objects;

public class Pear extends Fruit {

    public Pear(double weight, double price) {
        super(weight, price);
    }

    public Pear() {
    }

    @Override
    public double cost() {
        return getPrice() * getWeight();
    }


    @Override
    public String toString() {
        return "Pear{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                '}';
    }
}
