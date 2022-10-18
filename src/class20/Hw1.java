package class20;

public class Hw1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle, Square, and Box
    Use separate class to test your code
     */
    public void area (double l, double w) {
        System.out.println("The area of a rectangle is "+(l*w));
    }
    public void area (double l) {
        System.out.println("The area of a square is "+(l*l));
    }
    public void volume (double l, double w,double h) {
        System.out.println("The volume of a box is "+(l*w*h));
    }
}
class Hw1_tester{
    public static void main(String[] args) {
        Hw1 r=new Hw1();
        r.area(5.5,6.5);
        Hw1 s=new Hw1();
        s.area(5);
        Hw1 b=new Hw1();
        b.volume(5,6,3);
    }
}