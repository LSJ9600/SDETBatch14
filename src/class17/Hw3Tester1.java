package class17;

public class Hw3Tester1 {

    public static void main(String[] args) {
        //Hw3 car1=new Hw3("BMW", "Blue");  //private constructor
        //car1.printValue();
        Hw3 car2 = new Hw3("Audi", 2022);
        car2.printValue();
        Hw3 car3 = new Hw3(2021, "Black");
        car3.printValue();
        Hw3 car4 = new Hw3("Red");
        car4.printValue();

        // different class - same package
    }
}