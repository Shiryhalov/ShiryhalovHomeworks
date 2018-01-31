package com.company.hw8;

import java.util.Objects;

public class Roses extends Flower {
    protected double price;

    public Roses(String producerCountry, int bestBefore) {
        super(producerCountry, bestBefore);
        this.price = 30;
    }

    public Roses() {
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Roses roses = (Roses) o;
        return Double.compare(roses.price, price) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "Roses{" +
                "price=" + price +
                '}';
    }
}
