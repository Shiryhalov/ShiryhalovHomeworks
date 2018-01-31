package com.company.hw8;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower gvozdika = new Gvozdika("Германия", 10);
        Flower tulpan = new Tulpan("Бельгия", 20);
        Flower rose = new Roses("Польша", 30);

        Flower[] bouquet1 = new Flower[]{gvozdika, tulpan, rose};
        Flower[] bouquet2 = new Flower[]{tulpan, tulpan, tulpan};
        Flower[] bouquet3 = new Flower[]{tulpan, tulpan, rose, rose};

        System.out.println(gvozdika.bouquet(bouquet1));
        System.out.println(tulpan.bouquet(bouquet2));
        System.out.println(rose.bouquet(bouquet3));
        System.out.println("Продано цветов: " + Flower.count);
    }
}
