package class17;

public class Hw2 {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */
    private String name;
    private int sub1;
    private int sub2;
    private int sub3;
    public Hw2 (String name,int sub1, int sub2, int sub3) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    void calAverage() {
        System.out.println(name + " average grade is " + (sub2 + sub1 + sub3)/3);
    }
    public static void main(String[] args) {
        Hw2 stu1=new Hw2("John", 89,95,68);
        stu1.calAverage();

        Hw2 stu2=new Hw2("Charlie", 98,78,59);
        stu2.calAverage();

        Hw2 stu3=new Hw2("Jerry", 90,87,67);
        stu3.calAverage();

        Hw2 stu4=new Hw2("Mary", 99,68,56);
        stu4.calAverage();

        Hw2 stu5=new Hw2("Jenny", 98,78,99);
        stu5.calAverage();

    }
}
