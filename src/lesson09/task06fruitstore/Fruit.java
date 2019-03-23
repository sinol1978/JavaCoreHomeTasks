package lesson09.task06fruitstore;

public abstract class Fruit {
    double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    protected abstract double getTotalPrice();
    protected final void printManufacturerInfo(){
        System.out.print("Made in Ukraine");
    }
}
