package interfaces;

import java.util.Arrays;

public class HouseOfWomen {
    public static void main(String[] args) {
        Woman julia = new Woman("Julia");
        Woman vika = new Woman("Vika");
        Woman ifianna = new Woman("Ifianna");
        Woman elsa = new Woman("Elsa");
        Woman fewona = new Woman("Fewona");
        Woman aurora = new Woman("Aurora");

        Woman[] women = new Woman[]{julia, vika, ifianna, elsa, fewona, aurora};
        print(women);
        Arrays.sort(women);
        print(women);
    }

    private static void print(Woman[] array) {
        for (Woman each : array) {
            System.out.print(each);
        }
        System.out.print("\n");
    }
}
