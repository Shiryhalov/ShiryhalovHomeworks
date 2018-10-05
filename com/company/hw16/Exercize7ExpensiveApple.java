package com.company.hw16;


import com.company.hw9.Apple;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercize7ExpensiveApple {
    public static void main(String[] args) {
        List<Apple> arrayList = new ArrayList<>();
        arrayList.add(new Apple(1.2, 20));
        arrayList.add(new Apple(3, 15));
        arrayList.add(new Apple(2, 31));
        arrayList.add(new Apple(65, 23));
        arrayList.add(new Apple(4, 4));
        System.out.println("Коллекция изначально: ");
        for(Apple apple : arrayList){
            System.out.println(apple);
        }
        getExpensiveProduct(arrayList);
        System.out.println("\nКоллекция с яблоками, дороже 20: ");

        for(Apple apple : arrayList){
            System.out.println(apple);
        }
    }

    public static List<Apple> getExpensiveProduct(List<Apple> list) {
        List<Apple> result = new ArrayList<>();
        Iterator<Apple> iterator = list.iterator();
        while (iterator.hasNext()) {
            Apple apple = iterator.next();
            if (apple.getPrice() < 20) {
                iterator.remove();
                result.add(apple);
            }
        }
        return result;
    }
}