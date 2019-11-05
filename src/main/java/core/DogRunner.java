package core;

public class DogRunner {
    public static void main(String[] args) {
        Dog rex = new Dog();
        Dog arnold = new Dog("Arnold", "pomeranian", 8);
        System.out.println("Now our dogs status is:");
        System.out.println(rex.toString());
        System.out.println(arnold.toString());
        arnold.setCountOfLegs(3);
        System.out.println("Than Arnold has critical wound. \nAnd now he " + arnold.getCountOfLegs() + " legs left.");
        System.out.println("Rex says woof to pay respects");
        rex.setWoof(true);
        System.out.println("Finally dogs status become: ");
        System.out.println(rex.toString());
        System.out.println(arnold.toString());
    }
}
