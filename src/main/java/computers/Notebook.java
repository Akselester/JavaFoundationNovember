package computers;

public class Notebook extends Computer {
    public String isItCool(){
        if ((getPrice() / getScreenSize()) < 100.00d){
            return "Cool";
        }
        else {
            return "Shit";
        }
    }
}
