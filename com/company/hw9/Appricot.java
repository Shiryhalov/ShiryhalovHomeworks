package com.company.hw9;

import java.util.Objects;

public class Appricot extends Fruit {

    public Appricot(double weight, double price) {
        super(weight, price);
    }

    public Appricot() {
    }

    @Override
    public double cost() {
        return getPrice() * getWeight();
    }


    @Override
    public String toString() {
        return "Appricot{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                '}';
    }
}
