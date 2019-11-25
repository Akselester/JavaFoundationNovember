package interfaces;

public class House {
    public static void main(String[] args) {
        Cookable person1 = new Man();
        Cookable person2 = new Woman();

        person1.cook();
        person2.cook();

        Washable washable1 = new Woman();
        Washable washable2 = new WashingMachine();

        washable1.wash();
        washable2.wash();

        Cleanable cleanable = new Man();
        cleanable.clean();

        Man man = new Man("Fedor");
        try {
            Man man2 = (Man) man.clone();
            System.out.println(man2.getName());
            System.out.println(man.compareTo(man2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
