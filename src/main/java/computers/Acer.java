package computers;

public class Acer extends Notebook {
    public Acer(double price, int screenSize) {
        setPrice(price);
        setScreenSize(screenSize);
    }

    public String isItCool(){
        if ((getPrice() / getScreenSize()) < 100.00d){
            return "Cool";
        }
        else {
            return "Shit";
        }
    }
}
