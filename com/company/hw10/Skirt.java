package com.company.hw10;

public class Skirt extends Clothes implements WomensClothing {
    public String name = "Юбка";
    public void clotheAWoman() {

    }

    public Skirt(Sizes size, Double price, String color) {
        super(size, price, color);
    }

    public Skirt() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
