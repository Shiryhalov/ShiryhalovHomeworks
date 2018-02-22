package com.company.hw14;

public class FoodDemo {
    public static void main(String[] args) {
        Food fish = new Food("fish");
        Food meat = new Food("meat");
        fish.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cooking " + fish.getName());
            }
        });
        meat.prepare(() -> System.out.println("Cooking " + meat.getName()));
    }
}
