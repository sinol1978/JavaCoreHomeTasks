package lesson08.task04flowers;

public class Tulip extends Flower {

    private static int tulipCount;

    public Tulip() {
        tulipCount++;
    }

    public Tulip(String regionInfo, int term, double price) {
        super(regionInfo, term, price);
        tulipCount++;
    }

    public static int getTulipCount() {
        return tulipCount;
    }

    @Override
    protected void printFlowerInfo() {
        System.out.println("Tulip\t\tPrice: " + this.getPrice() + "\tTerm: " + this.getTerm() + "\tRegion: " + this.getRegionInfo());
    }
}
