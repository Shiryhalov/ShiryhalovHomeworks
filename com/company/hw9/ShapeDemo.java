package com.company.hw9;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("yellow", 3, 4);
        shapes[1] = new Circle("red", 4, 4);
        shapes[2] = new Rectangle("blue", 3, 4, 5);
        shapes[3] = new Rectangle("green", 1, 2, 3);
        shapes[0].draw();
        shapes[1].draw();
        shapes[2].draw();
        shapes[3].draw();
    }
}

