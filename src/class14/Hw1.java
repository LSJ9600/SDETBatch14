package class14;

public class Hw1 {

    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    static int max(int num1, int num2) {
        int largest;

        if (num1>num2) {
            largest=num1;
        }else {
            largest=num2;
        }
        return largest;
    }

    public static void main(String[] args) {
        Hw1 hw= new Hw1();
        System.out.println("The largest number is " + Hw1.max(9,4));
    }
}
