package com.company.hw9;

import java.util.Objects;

public abstract class Fruit {
    private double weight;
    private double price;

    public Fruit(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public Fruit() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    final public void printManufacturerInfo() {
        System.out.print("Made in Ukraine\n");
    }

    public abstract double cost();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
