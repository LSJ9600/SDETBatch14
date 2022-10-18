package class22;

public class Hw1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */
    public static void main(String[] args) {
        Student [] student={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student test:student){
            test.study();
            test.read();
            System.out.println("=================");
        }
        new SyntaxStudent().interview();
        System.out.println("=================");
        new CollegeStudent().exams();
        System.out.println("=================");
        new SchoolStudent().tests();
        System.out.println("=================");

        System.out.println("Using for loop");

        for (int i=0; i< student.length; i++){
            student[i].study();
            student[i].read();
        }


    }

}
class Student{
    void study(){
        System.out.println("Students should always study.");
    }
    void read(){
        System.out.println("Students need to read instructions.");
    }
}

class SyntaxStudent extends Student {
    void study(){
        System.out.println("Syntax students need to study how to code.");
    }
    void read(){
        System.out.println("Syntax students read codes all the time. ");
    }
    void interview(){
        System.out.println("Syntax will help for preparing for the interview if you pass.");
    }
}

class CollegeStudent extends Student {
    void study(){
        System.out.println("College students need to study and write alot of essays.");
    }
    void read(){
        System.out.println("College students read all the time.");
    }
    void exams(){
        System.out.println("College students have to pass all the exams to graduate.");
    }

}

class SchoolStudent extends Student {
    void study(){
        System.out.println("School students need to be attentive and learn.");
    }
    void read(){
        System.out.println("School students need to read as much as they can.");
    }
    void tests(){
        System.out.println("School students have to pass all the tests to go to High School.");
    }
}