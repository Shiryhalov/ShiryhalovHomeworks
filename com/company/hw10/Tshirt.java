package com.company.hw10;

public class Tshirt extends Clothes implements MensClothing, WomensClothing {

    public Tshirt(Sizes size, Double price, String color) {
        super(size, price, color);
        name = "Футболка";
    }

    public Tshirt() {
    }

    public void clotheAMan() {
    }

    public void clotheAWoman() {
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size='" + getSize() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
