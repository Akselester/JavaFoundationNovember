package equals;

public class Run {
    public static void main(String[] args) {
//        Those two users absolutely different.
        Programmer user1 = new Programmer("Anton", "Yandex", 4008493815L);
        Programmer user2 = new Programmer("Denis", "Rambler", 4008462371L);
//        This user have passportSN same as user1
        Programmer user3 = new Programmer("Boryan", "Azino777", 4008493815L);
//        And this user is copy of user1
        Programmer user4 = new Programmer("Anton", "Yandex", 4008493815L);

        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user4));
        System.out.println(user3.equals(user1));
        System.out.println(user3.equals(user3));
    }
}
