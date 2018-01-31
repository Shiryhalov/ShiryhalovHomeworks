package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class CarDemo {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Иванов И.В.", 35, 15);
        Driver driver2 = new Driver("Порох П.И.", 69, 23);
        Driver driver3 = new Driver("Путин В.В.", 63, 30);
        Engine engine1 = new Engine(120, "Москвич");
        Engine engine2 = new Engine(330, "Mercedes");
        Engine engine3 = new Engine(930, "Bugatti");
        Car car1 = new Car("Жигули", "легковой", 1400, driver1, engine1);
        Lorry lorry1 = new Lorry("Mercedes-Benz Sprinter", "грузовой",
                2800, driver2, engine2, 3500);
        SportCar sportCar1 = new SportCar("Bugatti Veyron", "гиперкар",
                1888, driver3, engine3, 407);
        car1.printInfo();
        car1.stop();
        lorry1.start();
        sportCar1.start();
        sportCar1.turnLeft();
        sportCar1.stop();
        sportCar1.printInfo();
    }
}

