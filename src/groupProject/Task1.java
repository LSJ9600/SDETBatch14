package groupProject;

public interface Task1 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.calculateArea(5);
        obj.calculatePerimeter(5);

        Square obj2=new Square();
        obj2.calculateArea(7);
        obj2.calculatePerimeter(7);
    }

}
interface Shape{
    void calculateArea(double length);
    void calculatePerimeter(double length );
}
class Circle implements Shape{

    @Override
    public void calculateArea(double radius) {
        System.out.println("The area of a circle is: "+ radius*radius*Math.PI);
    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("The perimeter of a circle is: "+ 2*radius*Math.PI);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double length) {
        System.out.println("The area of a square is: "+ length*length);
    }

    @Override
    public void calculatePerimeter(double length) {
        System.out.println("The perimeter of a square is: "+ 4*length);
    }
}
