package com.company.hw7;

public class PersonDemo {
    public static void main(String[] args) {
        Person dima = new Person("Дима", 22);
        Person vasya = new Person();

        vasya.setFullName("Вася");
        vasya.setAge(18);

        dima.talk();
        vasya.move();
    }
}
