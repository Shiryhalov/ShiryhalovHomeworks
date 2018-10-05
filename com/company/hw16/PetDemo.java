package com.company.hw16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetDemo {
    private static void showKeys(Map map) {
        Set<String> set = map.keySet();
        for (String i : set) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("Барсик", new Cat("Красный", 8, 23, "Кровавый нагломорд"));
        petMap.put("Шарик", new Dog("Черный", 18, 8, "Овчарка", 10));
        petMap.put("Кеша", new Parrot("Зеленый", 1, 15, 13));
        showKeys(petMap);
    }
}
