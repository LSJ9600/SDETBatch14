package class26;

import java.util.HashSet;

public class Hw6 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type. In this set we do not care about
        the insertion order. Each student object should have name and studentID. Display name of each student.
         */
        Student stu1=new Student("John", 1);
        Student stu2=new Student("James", 2);
        Student stu3=new Student("Jolly", 3);
        Student stu4=new Student("Claire", 4);
        Student stu5=new Student("Mary", 5);
        Student stu6=new Student("Smith", 6);

        HashSet<Student> student=new HashSet<>();
        student.add(stu1);
        student.add(stu2);
        student.add(stu3);
        student.add(stu4);
        student.add(stu5);
        student.add(stu6);
        System.out.println(student);

        var it=student.iterator();

        while (it.hasNext()) {
            var stu= it.next();
            System.out.println (stu.name);

        }
    }
    static class Student{
        String name;
        int studentID;

        Student(String name, int studentID){
            this.name=name;
            this.studentID=studentID;
        }
    }
}
