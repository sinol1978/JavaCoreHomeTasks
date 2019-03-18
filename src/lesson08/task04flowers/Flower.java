package lesson08.task04flowers;

public abstract class Flower {

    private String regionInfo;
    private int term;
    private double price;

    public Flower() {
    }

    public Flower(String regionInfo, int term, double price) {
        this.regionInfo = regionInfo;
        this.term = term;
        this.price = price;
    }

    public String getRegionInfo() {
        return regionInfo;
    }

    public void setRegionInfo(String regionInfo) {
        this.regionInfo = regionInfo;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected abstract void printFlowerInfo();
}
