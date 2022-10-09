package class16;

public class Hw2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    public static String sReverse (String sent) {

        StringBuilder sb = new StringBuilder(sent);
        sb.reverse();

        System.out.println(sb.toString());
        return sent;

        //return new StringBuilder(sent).reverse().toString();// easier and neat way to write the code.
    }

    public static void main(String[] args) {
        Hw2 hw= new Hw2();
        hw.sReverse("Replits are getting hard");

    }

}
