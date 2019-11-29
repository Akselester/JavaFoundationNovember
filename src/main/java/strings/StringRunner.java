package strings;

public class StringRunner {
    public static void main(String[] args) {
        String str1 = "Я замечтательная строка";
        String str2 = "Я замечтательная строка";
        System.out.println("Equals " + str1.equals(str2));
        System.out.println("== " + (str1 == str2));

        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("== " + (obj1 == obj2));
//        Создание строки без пула
        String s1 = new String("Я строка вне пула");
        String s2 = new String("Я строка вне пула");
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s2 " + (s1.intern() == s2.intern()));
        System.out.println("s1 == s2 " + (s1 == s2));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(57);
        stringBuilder.append('c');
        System.out.println("stringbuilder " + stringBuilder);
        String s = "";
        System.out.println("start for string");
        for (int i = 0; i < 100000; i++) {
            s = s + i;
        }
        System.out.println("end for string");

        StringBuilder strb1 = new StringBuilder();
        System.out.println("start for string builder");
        for (int i = 0; i < 100000; i++) {
            strb1.append(i);
        }
        System.out.println("End for string builder");
    }
}
