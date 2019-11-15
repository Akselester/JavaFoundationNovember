package computers;

public class Run {
    public static void main(String[] args) {
        Computer[] computers = new Computer[7];
        computers[0] = new Acer("Acer1", 35000, 15);
        computers[1] = new Acer("Acer2", 50000, 14);
        computers[2] = new Hp("HP1", 35000, 15);
        computers[3] = new Hp("HP2", 20000, 15);
        computers[4] = new Lenovo("Lenovo", 20000, 13);
        computers[5] = new Apple("Mc Book", 100500, 13);
        computers[6] = new Desktop("desktopchik", 65000, 24);
        for (Computer each : computers) {
            print(each);
        }
    }

    static void print(Computer computer){
        System.out.printf("Computer name: %s, Coolness: %s\n", computer.getName(), computer.isItCool());
    }
}
