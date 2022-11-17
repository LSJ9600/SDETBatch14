package class24;

import java.util.ArrayList;

public class Hw {
    /*
    Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Clarie");
        names.add("Smith");
        names.add("Tom");

        System.out.println("Is the given array empty? " + names.isEmpty());
        System.out.println("Is the name Tom present in the array? "+ names.contains("Tom"));
        System.out.println("The size of the array is: "+ names.size());
        System.out.println("All the value from the array is: "+ names);
    }
}
