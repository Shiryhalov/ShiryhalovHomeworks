package com.company.hw19;

public class SerializableHorse {
    public static void main(String[] args) {
        Horse horse = new Horse(120, 740, "Kobyla");
        horse.serializable();
        Horse horse1 = horse.deserializable();
        System.out.println(horse1);
    }
}
