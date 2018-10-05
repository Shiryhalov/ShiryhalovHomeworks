package com.company.hw16;

public class HeavyBox extends Box implements Comparable<HeavyBox> {
    int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    @Override
    public int compareTo(HeavyBox anotherHeavyBox) {
        int anotherHeavyBoxWeight = anotherHeavyBox.getWeight();
        return this.weight - anotherHeavyBoxWeight;
    }
}