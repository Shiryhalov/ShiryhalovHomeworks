package com.company.hw10;

public class Skirt extends Clothes implements WomensClothing {
    public String name = "Юбка";

    public Skirt(Sizes size, Double price, String color) {
        super(size, price, color);
    }

    public Skirt() {
    }

    public String getName() {
        return name;
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
