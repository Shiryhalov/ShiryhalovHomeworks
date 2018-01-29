package com.company.hw8;

public class Tulpan extends Flower {
    protected double price;

    public Tulpan(String producerCountry, int bestBefore) {
        super(producerCountry, bestBefore);
        this.price = 20;
    }

    public Tulpan() {
    }

    public double getPrice() {
        return price;
    }


}
