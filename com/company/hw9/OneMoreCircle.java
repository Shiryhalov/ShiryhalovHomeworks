package com.company.hw9;

import java.util.Objects;

public class OneMoreCircle {
    public double radius;
    private static double pi = 3.1415;

    public double cArea(){
        double area = 0;
        area = radius*radius*pi;
        return area;
    }

    public double cLength(){
        double length = 0;
        length = 2*radius*pi;
        return length;
    }

    public OneMoreCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OneMoreCircle that = (OneMoreCircle) o;
        return Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "OneMoreCircle{" +
                "radius=" + radius +
                '}';
    }
}
