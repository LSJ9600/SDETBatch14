package class16;

public class Hw3 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.

    private static String vowel(String s) {

        String vowel= s.replaceAll("[^aioueAIOUE]", "");
        return vowel;

        //return s.replaceAll("[^aioueAIOUE]", ""); // easier and cleaner way
    }

    public static void main(String[] args) {

        Hw3 hw= new Hw3();

        System.out.println(hw.vowel("beautiful"));
    }
}
