package animals;

public class CatAndDogRunner {
    public static void main(String[] args) {
        Animal barsik = new Cat();
        System.out.println("barsik:");
        barsik.makeSound();
        Animal lion = new Lion();
        System.out.println("lion:");
        lion.makeSound();
        Lion leva = new Lion();
        System.out.println("leva");
        leva.makeSound();
//        This method is unavailable if leva declared as Animal.
        leva.killAnimal();
        Animal bobik = new Dog("Bobik", "German shepherd", 5);
        System.out.println("bobik:");
        bobik.makeSound();
        System.out.println("=========================================\nTesting toString method:");
        System.out.println("barsik:");
        System.out.println(barsik.toString());
        System.out.println("lion:");
        System.out.println(lion.toString());
        System.out.println("leva");
        System.out.println(leva.toString());
        System.out.println("bobik:");
        System.out.println(bobik.toString());

    }
}
