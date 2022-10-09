package class16;

public class Hw1 {
    // Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.

    int arrSum(int arr[]) {

        int sum=0;

        for (int i=0; i<arr.length; i++) {

            sum+=arr[i];
        }

        return sum;

    }

    public static void main(String[] args) {
        Hw1 hw=new Hw1();

        int [] arr= {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.println("Sum of all elements in the array is " + hw.arrSum(arr));

    }
}
