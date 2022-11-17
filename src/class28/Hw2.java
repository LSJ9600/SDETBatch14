package class28;

import java.util.Map;
import java.util.TreeMap;

public class Hw2 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
         */

        Map<String, String> countries = new TreeMap<>();
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington D.C");
        countries.put("China", "Beijing");
        countries.put("Malaysia", "Kuala Lumpur");
        countries.put("Saudia Arabia", "Riyadh");
        countries.put("Russia", "Moscow");
        countries.put("England", "London");

        var iterator1 = countries.entrySet().iterator();
        for(Map.Entry<String, String> entry: countries.entrySet()){
            var country = entry.getKey();
            var capital = entry.getValue();
            System.out.println(country + " = " + capital);
        }
        System.out.println();

        var capitals = countries.values();
        for (String capital : capitals){
            System.out.println(capital);
        }
    }
}
