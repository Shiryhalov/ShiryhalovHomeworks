package com.company.hw9;

import java.util.Objects;

public class OneMoreCircle {
    private double radius;
    final private double PI = 3.1415;

    public OneMoreCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return PI;
    }

    public double cArea() {
        double area = 0;
        area = radius * radius * PI;
        return area;
    }

    public double cLength() {
        double length = 0;
        length = 2 * radius * PI;
        return length;
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
