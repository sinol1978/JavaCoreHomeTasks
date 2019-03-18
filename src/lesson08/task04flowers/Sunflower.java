package lesson08.task04flowers;

public class Sunflower extends Flower {

    private static int sunflowerCount;

    public Sunflower() {
        sunflowerCount++;
    }

    public Sunflower(String regionInfo, int term, double price) {
        super(regionInfo, term, price);
        sunflowerCount++;
    }

    public static int getSunflowerCount() {
        return sunflowerCount;
    }

    @Override
    protected void printFlowerInfo() {
        System.out.println("***** Sunflower *****");
        System.out.println("Price: " + this.getPrice() + "\tTerm: " + this.getTerm() + "\tRegion: " + this.getRegionInfo());
    }
}
