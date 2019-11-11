package core;

public class RunnigCat {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.sayMeow();
        Cat lion = new Lion();
        lion.sayMeow();
        Lion leva = new Lion();
        leva.sayMeow();
        leva.killAnimal();
    }
}
