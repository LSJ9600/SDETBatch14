package class28;

import java.util.ArrayList;

public class Hw7 {
    public static void main(String[] args) {
        /*
        Create a collection of integers in which you can keep duplicates.
        Write a logic to find sum of all integers
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
