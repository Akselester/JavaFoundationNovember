package interfaces;

public class WashingMachine implements Washable {

    @Override
    public void wash() {
        System.out.println("It's washing machine. It can clean your clothes.");
    }
}
