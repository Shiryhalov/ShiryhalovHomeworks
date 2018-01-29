package com.company.hw8;

import java.util.Objects;

public class Dog extends Animal {
    protected String breed;
    protected String name;

    public Dog(String food, String location, String breed, String name) {
        super(food, location);
        this.breed = breed;
        this.name = name;
    }

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public Dog() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " шумит");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed) &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), breed, name);
    }

    @Override
    public String toString() {
        return "Dog " + breed + " " + name;
    }
}
