package collections.workWithMap;

import interfaces.Man;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map<String, Man> manMap = new HashMap<>();
        manMap.put("Gosha", new Man("Georgiy"));
        manMap.put("Einar", new Man("Einar"));
        manMap.put("Julia", new Man("Julia"));

        manMap.get("Gosha").cook();
    }
}
