package class19;

public class Hw4 {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

    }
    class A {
        int salary=30000;
    }
    class B extends A {
        int b=2000;
    }
    class C extends B {
        float bonus=2000;
        public static void main(String args[]) {
            C obj=new C();
            obj.salary=obj.salary+obj.b;
            System.out.println("Total Salary is:"+obj.salary);
        }
    }

