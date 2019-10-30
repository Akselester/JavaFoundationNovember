package core;

public class DeskRunner {
    public static void main(String[] args) {
        Desk studentDesk = new Desk("wood", 1.75, 0.5, 0.7);
        System.out.println(studentDesk.getColor());
        System.out.println(studentDesk.toString());
        System.out.println("Volume = " + studentDesk.getVolume());
        System.out.println("BarelRoll = " + studentDesk.doBarelRoll());
    }
}
