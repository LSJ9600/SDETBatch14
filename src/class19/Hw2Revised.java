package class19;

public class Hw2Revised {
    /*
   Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
   In circle class create a method to calculate the area of circle. Test your code
    */
}
class Shape{
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circles extends Shape{
    Circles(double radius){
        super(radius);
    }
    void calculateArea(){
        // System.out.println(3.14*radius*radius);
        System.out.println(Math.PI*Math.pow(radius,2));
    }
    public static void main(String[] args) {
        Circles circle=new Circles(6);
        circle.calculateArea();
    }
}

