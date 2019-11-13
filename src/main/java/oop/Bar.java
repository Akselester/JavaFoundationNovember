package oop;

public class Bar {
    public static void main(String[] args) {
        Bottle smallBottle = new Bottle(400.00);
        smallBottle.printIsItBig();
        Bottle bigBottle = new Bottle(600.00);
        bigBottle.printIsItBig();

        WaterBottle smallWaterBottle = new WaterBottle(50.00);
        smallWaterBottle.printIsItBig();
        WaterBottle bigWaterBottle = new WaterBottle(200.00);
        bigWaterBottle.printIsItBig();

        BeerBottle smallBeerBottle = new BeerBottle(900.00);
        smallBeerBottle.printIsItBig();
        BeerBottle bigBeerBottle = new BeerBottle(1100.00);
        bigBeerBottle.printIsItBig();
        System.out.println("_______________________________________");
        printBottle(smallBottle);
        printBottle(bigBottle);
        printBottle(smallWaterBottle);
        printBottle(bigWaterBottle);
        printBottle(smallBeerBottle);
        printBottle(bigBeerBottle);
    }

    public static void printBottle(Bottle bottle){
        bottle.printIsItBig();
    }
}
