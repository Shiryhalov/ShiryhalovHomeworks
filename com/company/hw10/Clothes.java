package com.company.hw10;

import java.util.Objects;

public abstract class Clothes {
    private Sizes size;
    private Double price;
    private String color;
    private String name;

    public Clothes(Sizes size, Double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Clothes() {
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(size, clothes.size) &&
                Objects.equals(price, clothes.price) &&
                Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(size, price, color);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
