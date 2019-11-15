package computers;

public abstract class Computer {
    private String name;
    private double price;
    private int screenSize;

    public Computer(String name, double price, int screenSize) {
        this.name = name;
        this.price = price;
        this.screenSize = screenSize;
    }

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

    public String getName() {
        return name;
    }
}
