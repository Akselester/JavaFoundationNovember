package collections;

import interfaces.Human;
import interfaces.Man;
import interfaces.Woman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnotherListRunner {
    public static void main(String[] args) {
        Man human1 = new Man("Nikolay");
        Man human2 = new Man("Anton");
        Woman human3 = new Woman("Lisa");
        Woman human4 = new Woman("Bella");

        List list = new ArrayList<Human>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);
        printList(list);
        Collections.sort(list);
        System.out.println("=========================");
        printList(list);
    }

    static void printList(List<Human> l) {
        for (Human each : l) {
            System.out.println(each.getName());
        }
    }
}
