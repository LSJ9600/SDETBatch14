package class19;

public class Hw1 {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String number;
     public Hw1(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
class userInfo extends Hw1{
    String address;
    public userInfo(String name, String number, String address) {
        super(name, number);
        this.address = address;
    }
    public void userDetails() {
        System.out.println("Name: " + name + " Phone number: " + number+ " Address: " + address);
    }
}
class Hw1Tester{
    public static void main(String[] args) {
        userInfo obj=new userInfo("John", "123-456-7890", "123 Lee Road");
        obj.userDetails();

    }
}