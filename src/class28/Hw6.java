package class28;

import java.util.LinkedHashSet;
import java.util.Set;

public class Hw6 {
    public static void main(String[] args) {
        /*
        Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.
         */

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("O");
        stringSet.add("B");
        stringSet.add("J");
        stringSet.add("E");
        stringSet.add("C");
        stringSet.add("T");
        stringSet.add("S");

        String text= "";
        for(String word:stringSet){
            text += word;
        }
        System.out.println(text);
    }
}
