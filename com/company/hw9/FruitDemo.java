package com.company.hw9;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple = new Apple(0.2, 40.35);
        Fruit pear = new Pear(0.4, 43.50);
        Fruit appricot = new Appricot(0.5, 30.25);

        System.out.printf("%s%.2f%n", "Стоимость яблока: ", apple.cost());
        System.out.printf("%s%.2f%n", "Стоимость груши: ", pear.cost());
        System.out.printf("%s%.2f%n", "Стоимость абрикоса: ", appricot.cost());
    }
}
