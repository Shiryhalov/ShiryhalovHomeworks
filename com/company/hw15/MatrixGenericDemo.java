package com.company.hw15;

public class MatrixGenericDemo {
    public static void main(String[] args) {
        MatrixGeneric<Integer> matrix1 = new MatrixGeneric<>(new Integer[][]{{2, 2, 3}, {7, 5, 6}});
        MatrixGeneric<Double> matrix2 = new MatrixGeneric<>(new Double[][]{{2.0, 1.3, 4.5}, {3.6, 6.1, 10.1}});
        MatrixGeneric<Double> matrix3 = new MatrixGeneric<>();
        matrix3.setArray(new Double[][]{{2.0, 1.3}, {3.0, 6.1}, {2.3, 3.1}});

        System.out.println("-----------Сумма матриц--------------");
        matrix1.print();
        System.out.println("+");
        matrix2.print();
        System.out.println("=");
        matrix1.summ(matrix2).print();
        System.out.println("-----------Умножение матрицы на число--------------");
        matrix1.print();
        System.out.println("*");
        System.out.println("2");
        System.out.println("=");
        matrix1.multNumber(2).print();
        System.out.println("------------Перемножение матриц-------------");
        matrix1.print();
        System.out.println("*");
        matrix3.print();
        System.out.println("=");
        matrix1.multMatrix(matrix3).print();
    }
}
