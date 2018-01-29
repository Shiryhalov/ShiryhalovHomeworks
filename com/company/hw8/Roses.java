package com.company.hw8;

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
}
