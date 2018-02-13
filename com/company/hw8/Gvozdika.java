package com.company.hw8;

import java.util.Objects;

public class Gvozdika extends Flower {

    public Gvozdika(String producerCountry, int bestBefore, double price) {
        super(producerCountry, bestBefore, price);
    }

    public Gvozdika() {
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gvozdika gvozdika = (Gvozdika) o;
        return Double.compare(gvozdika.price, price) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "Gvozdika{" +
                "price=" + price +
                '}';
    }
}
