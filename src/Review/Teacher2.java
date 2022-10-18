package Review;

public class Teacher2 {
    String name, lname;
    String subject;
    int experience;
    double salary;
    static String school;

    //this. - use to refer to the current object : instance variables
    //      instance methods
    Teacher2(String name, String lname){
        this.name=name;
        this.lname=lname;
    }

    //this() - refers to the current object : current class constructor
    Teacher2(String name, String lname, String subject) {
        this(name, lname); //Constructor call must be the first statement in a constructor
        this.subject=subject;
    }

    Teacher2(String name, String lname, int experience){
        this(name, lname);
        this.experience=experience;
    }

    //static can work only with static
    static void work() {
        System.out.println("All teachers work at "+school);
    }
    //instance member of the class can work with instance and static members
    void print() {
        work();
        System.out.println("Taecher name is "+name+" "+lname);
    }

    void teach() {
        this.print();
        System.out.println(name+" teaches "+subject);
    }

    //method that will calculate bonus based on experience and return it
    double getBonus() {
        if(experience<5) {
            return 3;
        }else {
            return 3.5;
        }
    }

    public static void main(String[] args) {

        Teacher2 t=new Teacher2("John", "Smith");
        System.out.println(t.name);

        Teacher2 t1=new Teacher2("Jane", "Smith", "Biology");
        t1.teach();

        Teacher2 t2=new Teacher2("Jack", "Smith", 5);

        Teacher2.school="Syntax";
        Teacher2.work();

    }

}
