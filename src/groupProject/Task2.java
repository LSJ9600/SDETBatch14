package groupProject;

public class Task2 {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks
    in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
     */
    public static void main(String[] args) {
        Marks stu1= new A(75,85,95);
        stu1.getPercentage();

        Marks stu2=new B(99,76,43,56);
        stu2.getPercentage();
    }
}
abstract class Marks{
    abstract void getPercentage();
}
class A extends Marks{

    double sub1;
    double sub2;
    double sub3;

    A(double sub1, double sub2, double sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    @Override
    void getPercentage() {
        System.out.println("Student A got a percentage of "+((sub1+sub2+sub3)/300*100));
    }
}
class B extends Marks{
    double sub1;
    double sub2;
    double sub3;
    double sub4;

    B(double sub1, double sub2, double sub3, double sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }

    @Override
    void getPercentage() {
        System.out.println("Student B got a percentage of "+((sub1+sub2+sub3+sub4)/400*100));
    }
}
