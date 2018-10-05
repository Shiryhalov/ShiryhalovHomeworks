package com.company.hw16;

import java.util.Objects;

public class Cat extends Pet {
    private String breed;

    public Cat(String color, int weight, int age, String breed) {
        super(color, weight, age);
        this.breed = breed;
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
