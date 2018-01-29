package com.company.hw8;

import java.util.Objects;

public class Horse extends Animal {
    protected String kind;

    public Horse(String food, String location, String kind) {
        super(food, location);
        this.kind = kind;
    }

    public Horse(String kind) {
        this.kind = kind;
    }

    public Horse() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public void makeNoise() {
        System.out.println(kind + " лошадь шумит");
    }

    @Override
    public void eat() {
        System.out.println(kind + " лошадь ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(kind, horse.kind);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), kind);
    }

    @Override
    public String toString() {
        return "Horse " + kind;
    }
}
