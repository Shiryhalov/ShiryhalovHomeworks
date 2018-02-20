package com.company.hw10;

public class Skirt extends Clothes implements WomensClothing {

    public Skirt(Sizes size, Double price, String color) {
        super(size, price, color);
        name = "Юбка";
    }

    public Skirt() {
    }

    public void clotheAWoman() {

    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size='" + getSize() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
