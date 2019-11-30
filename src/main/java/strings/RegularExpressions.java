package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        System.out.println(verify("kfkdksnd"));
        System.out.println(verify("kfkd12ksnd"));
        System.out.println(verify("kfkd123ksnd"));
    }

    private static boolean verify(String string) {
        return Pattern.matches("[0-9a-zA-Z]*12[a-zA-Z]?[a-zA-Z]*", string);
    }
}
