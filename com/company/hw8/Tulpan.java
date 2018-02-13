package com.company.hw8;

import java.util.Objects;

public class Tulpan extends Flower {

    public Tulpan(String producerCountry, int bestBefore, double price) {
        super(producerCountry, bestBefore, price);
    }

    public Tulpan(String producerCountry, int bestBefore) {
        super(producerCountry, bestBefore);
        this.price = 20;
    }

    public Tulpan() {
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tulpan tulpan = (Tulpan) o;
        return Double.compare(tulpan.price, price) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "Tulpan{" +
                "price=" + price +
                '}';
    }
}
