package class21;

public class Hw2 {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will
    calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {
        CreditCard cc=new CreditCard(100,5);
        cc.calculateInterest();

        Visa v=new Visa(200,10);
        v.calculateInterest();

        AX ax=new AX(300,7);
        ax.calculateInterest();
    }
}
class CreditCard{
    double balance;
    double interest;
    CreditCard(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }

    void calculateInterest(){

        double interestAmount=interest*balance/100;
        System.out.println("Interest Amount "+interestAmount);
    }

}
class Visa extends CreditCard{

    Visa(double balance,double interest){
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("interest Amount "+interestAmount+5);
    }
}

class AX extends CreditCard {

    AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double interestAmount = interest * balance / 100;
        System.out.println();
        System.out.println("Interest Amount " + interestAmount + 10);
    }
}