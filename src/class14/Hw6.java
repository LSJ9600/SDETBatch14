package class14;

public class Hw6 {

    //Write a method to return whether given number is prime or not?

    void prime(int num) {
        if (num%2==0 && num <=3) {
            System.out.println(num + " is prime");
        }else {
            System.out.println(num + " is not prime");
        }

    }

    public static void main(String[] args) {
        Hw6 hw=new Hw6();
        hw.prime(2);
    }
}
