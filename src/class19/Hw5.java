package class19;

public class Hw5 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes
     */
    String fName;
    String lName;
    String department;
    String sub1;
    String sub2;
    public Hw5(String fName, String lName, String department, String sub1, String sub2) {
        this.fName = fName;
        this.lName = lName;
        this.department = department;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
}
class MathTeacher extends Hw5{
    int yearOfExperience;
    public MathTeacher(String fName, String lName, String department, String sub1, String sub2, int yearOfExperience) {
        super(fName, lName, department, sub1, sub2);
        this.yearOfExperience = yearOfExperience;
    }
    public void printInfo() {
        System.out.println(fName+" "+lName+" teaches "+sub1+" and "+sub2+" in the department of "+department+
                " since "+yearOfExperience+" years.");
    }
}
class ChemistryTeacher extends Hw5{
    String areaOfTeaching;
    public ChemistryTeacher(String fName, String lName, String department, String sub1, String sub2, String areaOfTeaching) {
        super(fName, lName, department, sub1, sub2);
        this.areaOfTeaching = areaOfTeaching;
    }
    public void printInfo() {
        System.out.println(fName+" "+lName+" teaches "+sub1+" and "+sub2+" in the department of "+department+
                " in the state of "+ areaOfTeaching);
    }
}
class PianoTeacher extends Hw5{
    String timeOfYear;
    public PianoTeacher(String fName, String lName, String department, String sub1, String sub2, String timeOfYear) {
        super(fName, lName, department, sub1, sub2);
        this.timeOfYear = timeOfYear;
    }
    public void printInfo() {
        System.out.println(fName+" "+lName+" teaches "+sub1+" and "+sub2+" in the department of "+department+
                " only in "+timeOfYear+ " time.");
    }
}
class Hw5Test{
    public static void main(String[] args) {
        MathTeacher obj1=new MathTeacher("Ayesha", "Heng", "Math", "Geometry",
                "Algebra",5);
        obj1.printInfo();

        ChemistryTeacher obj2=new ChemistryTeacher("Birsel", "Zengin", "Chemistry",
                "Physical Chemistry","Biochemistry", "Texas" );
        obj2.printInfo();

        PianoTeacher obj3=new PianoTeacher("Judith", "Elemo", "Piano",
                "Classical Piano", "Jazz Piano", "Summer");
        obj3.printInfo();
    }
}


