package lesson08.com.company.details;

public class Engine {
    private int horsePower;
    private String manufacturer;

    public Engine() {
    }

    public Engine(int horsePower, String manufacturer) {
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void printInfo() {
        System.out.println("Engine: " + getManufacturer() + "\t " + getHorsePower() + " hp");
    }
}
