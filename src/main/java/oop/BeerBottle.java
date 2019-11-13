package oop;

public class BeerBottle extends Bottle {
    public BeerBottle(double milliliters) {
        super(milliliters);
    }

    @Override
    public void printIsItBig(){
        if (getMilliliters() - 1000.00d > 0){
            System.out.println("Big bottle");
        }
        else {
            System.out.println("Small bottle");
        }
    }
}
