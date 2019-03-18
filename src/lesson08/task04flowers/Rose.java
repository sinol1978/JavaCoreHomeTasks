package lesson08.task04flowers;

public class Rose extends Flower {
    private static int roseCount = 0;

    public Rose() {
        roseCount++;
    }

    public Rose(String regionInfo, int term, double price) {
        super(regionInfo, term, price);
        roseCount++;
    }

    public static int getRoseCount() {
        return roseCount;
    }

    @Override
    protected void printFlowerInfo() {
        System.out.println("***** Rose *****");
        System.out.println("Price: " + this.getPrice() + "\tTerm: " + this.getTerm() + "\tRegion: " + this.getRegionInfo());
    }
}
