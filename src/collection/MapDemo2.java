package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> fruits = new HashMap<Integer, String>();
        fruits.put(10,"banana");
        fruits.put(20, "mango is the king of all fruits");
        fruits.put(30, "orange");
        fruits.put(40, "apple");
        fruits.put(50, "grapes");
        fruits.put(60, "peers");

        //it returns the value available against the key
        System.out.println(fruits.get(20));
        System.out.println(fruits);
        fruits.remove(30);
        System.out.println(fruits);
        System.out.println(fruits.containsKey(60));

    }
}
