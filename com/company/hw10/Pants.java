package com.company.hw10;

public class Pants extends Clothes implements MensClothing, WomensClothing {
    public String name = "Штаны";

    public Pants(Sizes size, Double price, String color) {
        super(size, price, color);
    }

    public Pants() {
    }

    public String getName() {
        return name;
    }

    public void clotheAMan() {
    }

    public void clotheAWoman() {
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size='" + getSize() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
