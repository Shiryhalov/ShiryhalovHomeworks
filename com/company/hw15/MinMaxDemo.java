package com.company.hw15;

public class MinMaxDemo {
    public static void main(String[] args) {
        MinMax<Integer> array = new MinMax<>(new Integer[]{25, 7, 16, 43});
        MinMax<Double> array1 = new MinMax<>(new Double[]{25.3, 13.5, 17.4, 98.3});
        array.print();
        array.min();
        array.max();
        System.out.println();
        array1.print();
        array1.min();
        array1.max();
    }
}
