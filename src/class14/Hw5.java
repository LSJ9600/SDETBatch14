package class14;

public class Hw5 {

    //Create a method createEmail(). Based on values of users name, lastName and email type,your method
    // should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String emailId (String firstName, String lastName, String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        Hw5 hw=new Hw5();
        System.out.println(hw.emailId("John", "Snow", "gmail"));
    }
}
