package computers;

public abstract class Computer {
    private double price;
    private int screenSize;

    public abstract String isItCool();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
