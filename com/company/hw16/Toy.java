package com.company.hw16;

import java.util.Objects;

public class Toy {
    private String color;
    private double weight;

    public Toy() {
    }

    public Toy(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Double.compare(toy.weight, weight) == 0 &&
                Objects.equals(color, toy.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
