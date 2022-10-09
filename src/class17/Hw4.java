package class17;

public class Hw4 {
    //Write program that have static constructor and observe result. //NOT POSSIBLE ERROR will be shown.

    private String name;
    private int salary;
    private int age;
    static String companyName = "Syntax";

    public Hw4(String name, int salary, int age, String companyName) { // we cannot use static will give error.
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.companyName= companyName;

    }

    void printSalary() {
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Hw4 emp1 = new Hw4("John", 50000, 35, "Syntax");
        emp1.printSalary();
    }
}