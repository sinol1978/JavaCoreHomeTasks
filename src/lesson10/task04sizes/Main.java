package lesson10.task04sizes;

public class Main {
    public static void main(String[] args) {
        Clothing[] clothing = {
                new Tshirt(Sizes.S, 10.5, "White", false),
                new Pants(Sizes.XXS, 15.5, "Black", true),
                new Skirt(Sizes.L, 21.5, "Red"),
                new Tie(Sizes.M, 5.5, "Blue")
        };

        ClothingStudio cs = new ClothingStudio();
        cs.putLadiesClothing(clothing);
        System.out.println("\n\n");
        cs.putMensClothing(clothing);
    }
}
