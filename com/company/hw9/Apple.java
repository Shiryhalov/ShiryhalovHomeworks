package com.company.hw9;

import java.util.Objects;

public class Apple extends Fruit {
    private double price;

    public Apple(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public Apple(double price) {
        this.price = price;
    }

    public Apple() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double cost() {
        double cost = price * getWeight();
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return Double.compare(apple.price, price) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                ", weight=" + getWeight() +
                '}';
    }
}
