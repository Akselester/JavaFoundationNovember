package strings;

public class Palindrome {
    public static void main(String[] args) {

        String[] testStrings = new String[]{"кабак", "бобр", "дрозд", "макар", "дед"};

        for (String each :
                testStrings) {
            System.out.println(each + " Is palindrome: " + isPalindrome(each));
        }
    }

    private static boolean isPalindrome(String string) {
        StringBuilder check = new StringBuilder(string);
        return check.reverse().toString().equals(string);
    }
}
