package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        System.out.println(verify("kfkdksnd"));
        System.out.println(verify("kfkd12ksnd"));
        System.out.println(verify("kfkd123ksnd"));
        System.out.println(verify("kfkd 12 3ksnd"));
        System.out.println(verify("kfkd 12d 3ksnd"));
    }

    private static boolean verify(String string) {
        return Pattern.matches("[\\w\\s]*12[a-zA-Z]{1}[\\w\\s]*", string);
    }
}
