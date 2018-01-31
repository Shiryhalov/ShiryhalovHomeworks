package com.company.hw10;

public class Tshirt extends Clothes implements MensClothing, WomensClothing {
    public String name = "Футболка";

    public Tshirt(Sizes size, Double price, String color) {
        super(size, price, color);
    }

    public Tshirt() {
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
        return "Tshirt{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
