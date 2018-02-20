package com.company.hw10;

public class Pants extends Clothes implements MensClothing, WomensClothing {

    public Pants(Sizes size, Double price, String color) {
        super(size, price, color);
        name = "Штаны";
    }

    public Pants() {
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
