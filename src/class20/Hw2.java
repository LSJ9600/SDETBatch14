package class20;
public class Hw2 {
    /*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed. If some String is passed to it,
    then in place of "programming languages" the value variable should be printed. Example, if we pass "Java",
    then "I love Java" should be printed.
     */

    public void program(){
        System.out.println("I love programming languages");
    }
    public void program(String msg){
        System.out.println("I love "+ msg);
    }
}
class Programming{
    public static void main(String[] args) {
        Hw2 p1=new Hw2();
        p1.program();
        Hw2 p2=new Hw2();
        p2.program("Java");

    }
}