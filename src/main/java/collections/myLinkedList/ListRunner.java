package collections.myLinkedList;

import interfaces.Man;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        //создали список без дженириков и это плохо
        List list = new ArrayList<>();
        Man man1 = new Man("Святослав");
        Man man2 = new Man("Иннокентий");

        list.add(man1);
        list.add(man2);
        list.add(new Object());  //<- поэтому (можем добавлять все что хотим (по умолчанию Object))

        System.out.println("Печать списка:");
        for (Object man : list) {
            if (man instanceof Man) {
                System.out.println(((Man) man).getName());
            }
        }

        System.out.println("\nmanArrayList: ");
        List<Man> manArrayList = new ArrayList<>();
        manArrayList.add(man1);
        manArrayList.add(man2);
//        manArrayList.remove(man2);
//        manArrayList.remove(man1);
        manArrayList.add(new Man("Мужчинка"));

        for (Man man : manArrayList) {
            System.out.println(man.getName());
        }

        for (Man man : manArrayList) {
            if (man.getName().equals("Мужчинка")) {
                System.out.println("index: " + manArrayList.indexOf(man));
            }
        }

        for (int i = 0; i < manArrayList.size(); i++) {
            if (manArrayList.get(i).getName().equals("Muzhik")) {
                System.out.println("index: " + i);
            }
        }

        System.out.println("New joined list");
        list.addAll(manArrayList);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
