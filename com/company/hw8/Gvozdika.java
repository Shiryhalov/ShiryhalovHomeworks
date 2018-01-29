package com.company.hw8;

public class Gvozdika extends Flower {
    protected double price;

    public Gvozdika(String producerCountry, int bestBefore) {
        super(producerCountry, bestBefore);
        this.price = 15.50;
    }

    public Gvozdika() {
    }

    public double getPrice() {
        return price;
    }
}
