package com.company.hw8;

import java.util.Objects;

public class Flower {
    private String producerCountry;
    private int bestBefore;
    protected double price;
    protected static int count = 0;

    public Flower(String producerCountry, int bestBefore) {
        this.producerCountry = producerCountry;
        this.bestBefore = bestBefore;
    }

    public Flower() {
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setProducerCountry(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return bestBefore == flower.bestBefore &&
                Objects.equals(producerCountry, flower.producerCountry);
    }

    @Override
    public int hashCode() {

        return Objects.hash(producerCountry, bestBefore);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "producerCountry='" + producerCountry + '\'' +
                ", bestBefore=" + bestBefore +
                '}';
    }

    public double bouquet(Flower[] bouquet) {
        double bouquetPrice = 0;
        for (int i = 0; i < bouquet.length; i++) {
            bouquetPrice += bouquet[i].getPrice();
            count++;
        }
        return bouquetPrice;
    }
}
