package com.company.hw8;

import java.util.Objects;

public class Cat extends Animal {
    protected String breed;
    protected String color;

    public Cat(String food, String location, String breed, String color) {
        super(food, location);
        this.breed = breed;
        this.color = color;
    }

    public Cat(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println(color + " кот шумит");
    }

    @Override
    public void eat() {
        System.out.println(color + " кот ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), breed, color);
    }

    @Override
    public String toString() {
        return "Cat " + breed;
    }
}
