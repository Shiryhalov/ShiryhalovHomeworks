package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String mark, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(mark, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String mark, String carClass, int weight, Driver driver, Engine engine) {
        super(mark, carClass, weight, driver, engine);
    }

    public Lorry() {
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public void printInfo() {
        System.out.println("Автомобиль марки " + mark +
                ", класс " + carClass +
                ", вес " + weight +
                ", грузоподъемность " + carrying +
                "; \nВодитель: " + driver.getFullName() +
                ", возраст " + driver.getAge() +
                ", опыт работы " + driver.getExperience() +
                "; \nМотор " + engine.getProducer() +
                ", мощность " + engine.getPower());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), carrying);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
