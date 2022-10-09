package class17;

public class Hw3 {
    /*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this
    class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */
    private String make;
    private String color;
    private int year;
    private Hw3 (String make,String color) {
        this.make = make;
        this.color = color;
    }
    public Hw3 (String make, int year) {
        this.make = make;
        this.year = year;
    }
    protected Hw3 (int year, String color) {
        this.year = year;
        this.color = color;
    }
    Hw3(String color) {
        this.color = color;
    }
    public void printValue () {
        System.out.println("The car make is " + make + " of year " + year + " in " + color + " color.");
    }
    public static void main(String[] args) {
        Hw3 car1=new Hw3("BMW", "Blue");
        car1.printValue();
        Hw3 car2=new Hw3("Audi", 2022);
        car2.printValue();
        Hw3 car3=new Hw3(2021,"Black");
        car3.printValue();
        Hw3 car4= new Hw3("Red");
        car4.printValue();

        //same class - same package
    }
}
