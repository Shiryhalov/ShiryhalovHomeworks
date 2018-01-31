package com.company.hw10;

public class Tie extends Clothes implements MensClothing{
    public String name = "Галстук";

    public Tie(Sizes size, Double price, String color) {
        super(size, price, color);
    }

    public Tie() {
    }

    public String getName() {
        return name;
    }

    public void clotheAMan() {
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
