package lesson08.task05animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Meat", "LA", "Snoopy", "Shepherd"),
                new Cat("Milk", "Sacramento", "Kitty", 2),
                new Horse("Hay", "Oakland", "Bucephalos", "black")
        };

        for (Animal item : animals) {
            Vet.treatAnimal(item);
        }
        Animal horse1 = new Horse("Hay", "Oakland", "Bucephalos", "black");
        horse1.save();
        Animal horse2 = Horse.load();
        System.out.println(horse2);
    }
}
