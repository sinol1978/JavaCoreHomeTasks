package lesson08.com.company.vehicles;

import lesson08.com.company.details.Engine;
import lesson08.com.company.professions.Driver;

public class Lorry extends Car {

    private int MaxWeightLimit;

    public Lorry() {
    }

    public Lorry(String carBrandName, String carClassType, double carWeight, Engine engine, Driver driver, int maxWeightLimit) {
        super(carBrandName, carClassType, carWeight, engine, driver);
        MaxWeightLimit = maxWeightLimit;
    }

    public int getMaxWeightLimit() {
        return MaxWeightLimit;
    }

    public void setMaxWeightLimit(int maxWeightLimit) {
        MaxWeightLimit = maxWeightLimit;
    }
}
