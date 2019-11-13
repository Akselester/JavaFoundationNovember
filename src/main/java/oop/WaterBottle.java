package oop;

public class WaterBottle extends Bottle{
    public WaterBottle(double milliliters) {
        super(milliliters);
    }

    @Override
    public void printIsItBig(){
        if (getMilliliters() - 100.00d > 0){
            System.out.println("Big bottle");
        }
        else {
            System.out.println("Small bottle");
        }
    }
}
