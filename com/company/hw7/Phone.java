package com.company.hw7;

import java.util.Objects;

public class Phone {
    long number;
    String model;
    double weight;
    static int counter;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(long number, String model, double weight) {
        this(number, model);
        this.weight = weight;
        counter++;
    }

    public Phone(long number, String model) {

        this.number = number;
        this.model = model;
    }

    public Phone() {
        counter++;
    }

    public void receiveCall(String name, long numberC) {
        System.out.println("Звонит " + name + " " + numberC);
    }

    public void sendMessage(long... arg) {
        System.out.println("Сообщение отправлено на номера: ");
        for (long x : arg) {
            System.out.print(x + " ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number &&
                Double.compare(phone.weight, weight) == 0 &&
                Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, model, weight);
    }
}



