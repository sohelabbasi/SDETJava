package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo3 {

    public static void main(String[] args) {
        Map<Integer, String> cars = new LinkedHashMap<>();
        cars.put(123, "BMW");
        cars.put(345, "Audi");
        cars.put(456, "mercedese");
        cars.put(567, "hyundai");

        System.out.println(cars.entrySet());
        System.out.println(cars.containsKey(567));
    }


}
