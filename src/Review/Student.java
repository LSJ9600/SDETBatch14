package Review;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
        private String firstname;
        private String lastName;
        private String rollNumber;

        public Student(String firstname, String lastName, String rollNumber) {
            this.firstname = firstname;
            this.lastName = lastName;
            this.rollNumber = rollNumber;
    }
    void printName(){
        System.out.println(firstname+lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }

    /*
    if we don't override this method java by default checks the address only
    to figure out if two objects are same or not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstname, student.firstname) && Objects.equals(lastName, student.lastName) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName, rollNumber);
    }


    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Josh","Plantin","123"));
        students.add(new Student("Adam","Park","123"));
        students.add(new Student("Yusuf","Engin","123"));
        students.add(new Student("Cam","Jo","123"));

        // System.out.println(students);

        // coming up next how we can remove elements how we can access methods from a class

       /* for (Student student : students) {
            student.printName();
        }*/

        Student joshAgain=new Student("Josh","Plantin","123");
        System.out.println(students.contains(joshAgain));
        System.out.println(joshAgain);
        System.out.println(students);
    }
}
