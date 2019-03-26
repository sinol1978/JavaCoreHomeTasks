package lesson10.task04sizes;

public class ClothingStudio implements LadiesClothing, MensClothing {

    public ClothingStudio() {
    }

    @Override
    public void putLadiesClothing() {

    }

    public void putLadiesClothing(Clothing[] clothing) {
        for(Clothing item : clothing){
            if(item instanceof Tshirt || item instanceof Pants || item instanceof Skirt){
                System.out.println(item.toString());
            }
        }
    }


    @Override
    public void putMensClothing() {

    }

    public void putMensClothing(Clothing[] clothing) {
        for(Clothing item : clothing){
            if(item instanceof Tshirt || item instanceof Pants || item instanceof Tie){
                System.out.println(item.toString());
            }
        }
    }
}
