package com.company.hw10;

public class Tie extends Clothes implements MensClothing{
    public String name = "Галстук";
    public void clotheAMan() {

    }

    public Tie(Sizes size, Double price, String color) {
        super(size, price, color);
    }

    public Tie() {
    }

    public String getName() {
        return name;
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
