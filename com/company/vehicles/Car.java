package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Objects;

public class Car {
    protected String mark;
    protected String carClass;
    protected int weight;
    protected Driver driver;
    protected Engine engine;
    protected static boolean pos;

    public Car(String mark, String carClass, int weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
        pos = true;
    }

    public void stop() {
        if (pos) {
            System.out.println("Останавливаемся");
            pos = false;
        } else {
            System.out.println("Автомобиль еще не поехал");
        }
    }

    public void turnRight() {
        if (pos) {
            System.out.println("Поворот направо");
        } else {
            System.out.println("Автомобиль еще не поехал");
        }
    }

    public void turnLeft() {
        if (pos) {
            System.out.println("Поворот налево");
        } else {
            System.out.println("Автомобиль еще не поехал");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(carClass, car.carClass) &&
                Objects.equals(driver, car.driver) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mark, carClass, weight, driver, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void printInfo() {
        System.out.println("Автомобиль марки " + mark +
                ", класс " + carClass +
                ", вес " + weight +
                "; \nВодитель: " + driver.getFullName() +
                ", возраст " + driver.getAge() +
                ", опыт работы " + driver.getExperience() +
                "; \nМотор " + engine.getProducer() +
                ", мощность " + engine.getPower());
    }
}
