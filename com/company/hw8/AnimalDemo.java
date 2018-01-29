package com.company.hw8;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat = new Cat("Паштет куриный", "квартира", "Сфинкс", "телесный");
        Animal dog = new Dog("Мясо куриное", "дом", "Русский спаниель", "Барон");
        Animal horse = new Horse("Мясо человеческое", "Сарай за туалетом",
                "Лошадь Пржевальского");

        Vet vet = new Vet();

        Animal[] animals = new Animal[]{cat, dog, horse};
        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
        }
    }
}
