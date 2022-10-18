package class19;

public class Hw2 {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
    double radius1;
    double radius2;
    public Hw2(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }
}
class Circle extends Hw2 {
    public Circle(double radius1, double radius2) {
        super(radius1, radius2);
    }
    public void Area() {
        double area;
        area= 3.14*radius1*radius2;
        System.out.println("The area of a circle is " + area);
    }
}
class Hw2Test{
    public static void main(String[] args) {
        Circle obj=new Circle(7,7);
        obj.Area();
    }
}