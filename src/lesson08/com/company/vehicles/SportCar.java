package lesson08.com.company.vehicles;

import lesson08.com.company.details.Engine;
import lesson08.com.company.professions.Driver;

public class SportCar extends Car{

    private int MaxSpeedLimit;

    public SportCar() {
    }

    public SportCar(String carBrandName, String carClassType, double carWeight, Engine engine, Driver driver, int maxSpeedLimit) {
        super(carBrandName, carClassType, carWeight, engine, driver);
        MaxSpeedLimit = maxSpeedLimit;
    }

    public int getMaxSpeedLimit() {
        return MaxSpeedLimit;
    }

    public void setMaxSpeedLimit(int maxSpeedLimit) {
        MaxSpeedLimit = maxSpeedLimit;
    }
}
