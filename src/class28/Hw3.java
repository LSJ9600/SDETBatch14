package class28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hw3 {
    public static void main(String[] args) {
        /*
        Create a map of Best Buy store. Place item id and item name into it.
        Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.
         */

        Map<Integer, String> items = new HashMap<>();
        items.put(12, "Oven");
        items.put(23, "Microwave");
        items.put(34, "Dishwasher");
        items.put(45, "Refrigerator");
        items.put(56, "Washing Machine");
        items.put(78, "Dryer");
        items.put(89, "Laptop");

        Iterator<Map.Entry<Integer, String>> iterator = items.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            var key = entry.getKey();
            var value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
