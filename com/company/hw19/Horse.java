package com.company.hw19;

import java.io.*;
import java.util.Objects;

public class Horse extends Animal implements Serializable {
    private String name;

    public Horse(int height, int weight, String name) {
        super(height, weight);
        this.name = name;
    }

    public Horse(String name) {
        this.name = name;
    }

    public Horse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void serializable() {
        Horse horse = this;
        try (FileOutputStream fos = new FileOutputStream("src/com/company/hw19/horse.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(horse);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Horse deserializable() {
        Horse horse = new Horse();
        try (FileInputStream fos = new FileInputStream("src/com/company/hw19/horse.ser");
             ObjectInputStream oos = new ObjectInputStream(fos)) {
            return (Horse) oos.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return horse;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
