package class18;

public class Hw1 {
    //Write a Student class that have instance variables name and address.
    //Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.

    String name;
    String address;

    public Hw1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("Name is " + name + " and address is " + address);
    }

    public static void main(String[] args) {
        Hw1 stu1=new Hw1("John", "750 Lee Road");
        stu1.displayInfo();
    }
}
