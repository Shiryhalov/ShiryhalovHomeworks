package com.company.hw19;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable{
    private int height;
    private int weight;

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Animal() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return height == animal.height &&
                weight == animal.weight;
    }

    @Override
    public int hashCode() {

        return Objects.hash(height, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
