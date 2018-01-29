package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String mark, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(mark, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public SportCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public SportCar(String mark, String carClass, int weight, Driver driver, Engine engine) {
        super(mark, carClass, weight, driver, engine);
    }

    public SportCar() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return maxSpeed == sportCar.maxSpeed;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    public void printInfo() {
        System.out.println("Автомобиль марки " + mark +
                ", класс " + carClass +
                ", вес " + weight +
                ", предельная скорость " + maxSpeed +
                "; \nВодитель: " + driver.getFullName() +
                ", возраст " + driver.getAge() +
                ", опыт работы " + driver.getExperience() +
                "; \nМотор " + engine.getProducer() +
                ", мощность " + engine.getPower());
    }
}
