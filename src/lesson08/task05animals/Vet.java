package lesson08.task05animals;

public class Vet {

    public Vet() {
    }

    public static void treatAnimal(Animal animal) {
        System.out.print("Call from " + animal.getLocation() + ": ");
        System.out.println("Problems with " + animal.getFood());
    }
}
