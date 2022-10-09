package class16;

import java.sql.SQLOutput;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */

    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee task1= new SyntaxEmployee();
        task1.empId="123";
        task1.salary=100000;
        System.out.println(task1.empId);
        System.out.println(task1.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee task2= new SyntaxEmployee();
        task2.empId="456";
        task2.salary=200000;
        System.out.println(task2.empId);
        System.out.println(task2.salary);
        System.out.println(SyntaxEmployee.CEO);
    }

}
