package com.company.hw16;

import java.util.Objects;

public class Dog extends Pet{
    private String breed;
    private double hairLenght;

    public Dog(String color, int weight, int age, String breed, double hairLenght) {
        super(color, weight, age);
        this.breed = breed;
        this.hairLenght = hairLenght;
    }

    public Dog(String color, int weight, int age) {
        super(color, weight, age);
    }

    public Dog() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHairLenght() {
        return hairLenght;
    }

    public void setHairLenght(double hairLenght) {
        this.hairLenght = hairLenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Double.compare(dog.hairLenght, hairLenght) == 0 &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), breed, hairLenght);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", hairLenght=" + hairLenght +
                '}';
    }
}
