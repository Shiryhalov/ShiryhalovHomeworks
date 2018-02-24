package com.company.hw15;

import java.util.Arrays;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public MinMax() {
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void min() {
        Double min;
        min = getArray()[0].doubleValue();
        for (T i : array) {
            if (i.doubleValue() <= min) {
                min = i.doubleValue();
            }
        }
        System.out.println("Минимум: " + min);
    }

    public void max() {
        Double max;
        max = getArray()[0].doubleValue();
        for (T i : array) {
            if (i.doubleValue() >= max) {
                max = i.doubleValue();
            }
        }
        System.out.println("Максимум: " + max);
    }

    public void print() {
        System.out.print("Массив: ");
        for (T i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinMax<?> minMax = (MinMax<?>) o;
        return Arrays.equals(array, minMax.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
