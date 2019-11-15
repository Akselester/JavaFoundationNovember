package computers;

public class Desktop extends Computer {

    public Desktop(String name, double cost, int size) {
        super(name, cost, size);
    }

    @Override
    public String isItCool() {
//        "Don't matter how much it costs. You must have one of them!"
        return "Cool";
    }
}
