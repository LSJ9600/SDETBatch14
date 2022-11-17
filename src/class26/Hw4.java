package class26;

import java.util.Iterator;
import java.util.TreeSet;

public class Hw4 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries. In this set we want all
        objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
         */

        TreeSet<String> names=new TreeSet<>();
        names.add("USA");
        names.add("Russia");
        names.add("India");
        names.add("China");
        names.add("Japan");
        names.add("England");
        System.out.println(names);

        var it=names.iterator();

        while (it.hasNext()) {
            var name= it.next();
            System.out.print(name+" ");

        }
    }
}
