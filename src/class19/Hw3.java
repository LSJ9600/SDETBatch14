package class19;

public class Hw3 {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
}
    class Z{
    static String printF(){
        return "Java";
    }
}

class X extends Z{
    public static void main(String[] args) {
        X obj=new X();
        System.out.println(obj.printF());
    }

}