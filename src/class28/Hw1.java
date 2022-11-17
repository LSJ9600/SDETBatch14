package class28;

import java.util.HashMap;
import java.util.Map;

public class Hw1 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map
         */

        Map<Integer, String> companies = new HashMap<>();
        companies.put(1, "Amazon.");
        companies.put(2, "Google");
        companies.put(3, "Microsoft");
        companies.put(4, "Syntax");
        companies.put(5, "Syntax");
        companies.put(6, "Safari");
        companies.put(7, "Ebay");

        companies.forEach((key, value) -> System.out.println(key + " = " + value));
        companies.replace(4, "AliBaba");
        companies.remove(7);

        System.out.println();
        companies.forEach((key, value) -> System.out.println(key + " = " + value));

    }
}
