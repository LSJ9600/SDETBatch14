package class20;

public class Hw4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded
    method with specific arguments and observe result.
     */
    private void name (String name) {
        System.out.println("My name is " + name);
    }
    private void name (int houseNumber, String detail) {
        System.out.println("I live in " + detail+ " and my house number is "+ houseNumber);
    }
    private void name (int num) {
        System.out.println("My phone number is "+ num);
    }

    public static void main(String[] args) {
        Hw4 a=new Hw4();
        a.name("Lubna");
        Hw4 b=new Hw4();
        b.name(1234, "Chicago");
        Hw4 c=new Hw4();
        c.name(1234567890);
    }
}

