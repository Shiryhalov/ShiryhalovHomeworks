package com.company.hw8;

public class Vet {
    void treatAnimal(Animal animal){
        System.out.println("Пациент: " + animal);
        System.out.println("Пища: " + animal.food);
        System.out.println("Место обитания: " + animal.location + "\n");
    }

    public Vet() {
    }
}
