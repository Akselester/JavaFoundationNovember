package collections.workWithSet;

import java.util.HashSet;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Volida");

        for (String element :
                stringSet) {
            System.out.println(element);
        }
    }
}
