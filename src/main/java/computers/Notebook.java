package computers;

public class Notebook extends Computer {
    private double coefficient;

    public Notebook(String name,double price, int screenSize, double coefficient) {
        super(name, price, screenSize);
        this.coefficient = coefficient;
    }

    @Override
    public String isItCool() {
        if ((getPrice() / getScreenSize()) < coefficient) {
            return "Cool";
        } else {
            return "Shit";
        }
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
}

