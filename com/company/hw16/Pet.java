package com.company.hw16;

import java.util.Objects;

public class Pet {
    private String color;
    private int weight;
    private int age;

    public Pet(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public Pet() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return weight == pet.weight &&
                age == pet.age &&
                Objects.equals(color, pet.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, weight, age);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
