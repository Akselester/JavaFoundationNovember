package collections;

import interfaces.Man;

import java.util.*;

public class MiddleOfList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menuString = "1. Insert item to start...\n" +
                "2. Insert item to middle...\n" +
                "3. Insert item to end...\n" +
                "4. Contains Man...\n" +
                "5. Contains Men...\n" +
                "6. Exit.\n";
        List<Man> manList = new ArrayList<>();
        manList.add(new Man("Petr"));
        manList.add(new Man("Pavel"));
        manList.add(new Man("Gavrila"));
        manList.add(new Man("Mikola"));
        manList.add(new Man("Ahmed"));
        manList.add(new Man("Boris"));
        manList.add(new Man("Tommy"));
        System.out.println("list before insertion: ");
        printList(manList);
        System.out.print(menuString);
        boolean flag = true;
        while (flag) {
            switch (menuSelection(scan)) {
                case 1:
                    addToStart(manList, scan);
                    System.out.println("list after insertion");
                    printList(manList);
                    break;
                case 2:
                    addToMiddle(manList, scan);
                    System.out.println("list after insertion");
                    printList(manList);
                    break;
                case 3:
                    addToEnd(manList, scan);
                    System.out.println("list after insertion");
                    printList(manList);
                    break;
                case 4:
                    System.out.println(containsMan(manList, scan));
                    break;
                case 5:
                    System.out.println(containsMen(manList, scan));
                    break;
                case 6:
                    flag = false;
                    System.out.println("Exiting...");
            }
        }
    }

    static void printList(List<Man> list) {
        for (Man eachMan :
                list) {
            System.out.print(eachMan.getName() + " ");
            System.out.print("\n");
        }
    }

    static void addToStart(List<Man> list, Scanner scan) {
        System.out.println("Enter the name of Man");
        scan.nextLine();
        list.add(0, new Man(scan.nextLine()));
    }

    static void addToMiddle(List<Man> list, Scanner scan) {
        int middle = list.size() / 2;
        System.out.println("Enter the name of Man");
        scan.nextLine();
        list.add(middle, new Man(scan.nextLine()));
    }

    static void addToEnd(List<Man> list, Scanner scan) {
        System.out.println("Enter the name of Man");
        scan.nextLine();
        list.add(new Man(scan.nextLine()));
    }

    static boolean containsMan(List<Man> list, Scanner scan) {
        scan.nextLine();
        System.out.println("Enter the name of Man");
        return list.contains(new Man(scan.nextLine()));
    }

    static boolean containsMen(List<Man> list, Scanner scan) {
        scan.nextLine();
        System.out.println("Enter names of Men over \",\"");
        String[] names = scan.nextLine().split(",");
        List<Man> men = new ArrayList<>();
        for (String eachName :
                names) {
            men.add(new Man(eachName.strip()));
        }
        return list.containsAll(men);
    }

    static int menuSelection(Scanner scan) {
        while (true) {
            int selectedPoint = scan.nextInt();
            if ((selectedPoint < 1) | (selectedPoint > 6)) {
                System.out.println("This point not exists,\nchoose the correct point");
            } else {
                return selectedPoint;
            }
        }
    }
}
