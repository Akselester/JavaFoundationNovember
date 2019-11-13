package oop;

public class Bottle {
    private double milliliters;

    public Bottle(double milliliters) {
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }

    public void printIsItBig(){
        if (milliliters - 500.00d > 0){
            System.out.println("Big bottle");
        }
        else {
            System.out.println("Small bottle");
        }
    }
}
