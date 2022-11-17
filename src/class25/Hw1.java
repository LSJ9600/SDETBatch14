package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw1 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> names=new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Clarie");
        names.add("Smith");
        names.add("Tom");

            Iterator<String> iterator=names.iterator();

            while (iterator.hasNext()){
                String item= iterator.next();
                if(item.endsWith("e")){
                    iterator.remove();
                }
            }
            System.out.println(names);

        }
    }

