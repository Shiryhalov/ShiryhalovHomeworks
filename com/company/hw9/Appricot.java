package com.company.hw9;

import java.util.Objects;

public class Appricot extends Fruit {
    double price;

    @Override
    public double cost() {
        double cost = price * weight;
        return cost;
    }

    public Appricot(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public Appricot(double price) {
        this.price = price;
    }

    public Appricot() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Appricot appricot = (Appricot) o;
        return Double.compare(appricot.price, price) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "Appricot{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
