package com.company.hw9;

import java.util.Objects;

public class Pear extends Fruit {
    double price;

    @Override
    public double cost() {
        double cost = price * weight;
        return cost;
    }

    public Pear(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public Pear(double price) {
        this.price = price;
    }

    public Pear() {
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
        Pear pear = (Pear) o;
        return Double.compare(pear.price, price) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
