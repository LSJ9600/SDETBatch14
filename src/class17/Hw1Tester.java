package class17;

public class Hw1Tester {
    //Create a separate Test class where you will execute both of the constructors 1 by 1.

    public static void main(String[] args) {
        Hw1 obj1= new Hw1();
        obj1.call();

        System.out.println("-------------------------");

        Hw1 obj2= new Hw1("Apple", "Iphone", "Grey", 256 );
        obj2.takePicture();
    }
}
