package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw2 {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Fanta");
        drinks.add("Sprite");
        drinks.add("Dr Pepper");
        drinks.add("Mountain Dew");
        drinks.add("Milk");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water"); //replace
            }
        }
        System.out.println(drinks);
    }
}


