package class26;

import java.util.LinkedHashSet;

public class Hw5 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */
        LinkedHashSet<String> city=new LinkedHashSet<>();
        city.add("Amsterdam");
        city.add("Chicago");
        city.add("New York City");
        city.add("Arlington");
        city.add("Clinton");
        System.out.println(city);

        var it=city.iterator();

        while (it.hasNext()) {
            var cities= it.next();
            if(cities.startsWith("A")){
                it.remove();
            }
        }
        System.out.print(city);
    }
}
