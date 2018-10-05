package com.company.hw16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapToy {
    public static void main(String[] args) {
        Toy toy1 = new Toy("green", 5);
        Toy toy2 = new Toy("blue", 3);
        Toy toy3 = new Toy("pink", 1);
        Map<String, Toy> toyMap = new HashMap<>();
        toyMap.put("Soldier", toy1);
        toyMap.put("Car", toy2);
        toyMap.put("Bear", toy3);
        System.out.println("Пары значений:");
        Set toysSet = toyMap.entrySet();
        for(Object i: toysSet){
            System.out.println(i);
        }
        System.out.println("\nЗначения игрушек:");
        Collection valuesSet = toyMap.values();
        for(Object i: valuesSet){
            System.out.println(i);
        }
        System.out.println("\nНабор из имен игрушек:");
        Collection keySet = toyMap.keySet();
        for(Object i: keySet){
            System.out.println(i);
        }
    }
}
