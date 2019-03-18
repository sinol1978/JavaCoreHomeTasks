package lesson08.com.company.vehicles;

import lesson08.com.company.details.Engine;
import lesson08.com.company.professions.Driver;

public class Car {
    private String carBrandName;
    private String carClassType;
    private double carWeight;
    private Engine engine;
    private Driver driver;

    public Car() {
    }

    public Car(String carBrandName, String carClassType, double carWeight, Engine engine, Driver driver) {
        this.carBrandName = carBrandName;
        this.carClassType = carClassType;
        this.carWeight = carWeight;
        this.engine = engine;
        this.driver = driver;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarClassType() {
        return carClassType;
    }

    public void setCarClassType(String carClassType) {
        this.carClassType = carClassType;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

//    Методы start(), stop(), turnRight(), turnLeft(),
//    которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
//    А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.

    public void start(){
        System.out.println("Go!");
    }

    public void stop(){
        System.out.println("Stop!");
    }

    public void turnRight(){
        System.out.println("Turn to the right!");
    }

    public void turnLeft(){
        System.out.println("Turn to the left!");
    }

    public void printInfo(){
        System.out.println("Brand: " + getCarBrandName());
        System.out.println("Class: " + getCarClassType());
        System.out.println("Weight: " + getCarWeight());
        this.engine.printInfo();

    }
}
