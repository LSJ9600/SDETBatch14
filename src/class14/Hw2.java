package class14;

public class Hw2 {

    //Create a method that will take a number and prints whether the number is even or odd.

    boolean isEven(int num) {
        if (num%2==0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Hw2 hw=new Hw2();
        if (hw.isEven(3)) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
