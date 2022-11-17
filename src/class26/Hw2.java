package class26;

import java.util.LinkedList;

public class Hw2 {
    public static void main(String[] args) {
        /*
        Create a Card class that will have implemented  and unimplemented methods and a constructor that
        will initializes credit card type.  Create 3 subclasses of a Card card. Create 3 objects of different card
        and store them into LinkedList. Using for loop/advanced for loop/ iterator access all methods of the class.
         */
        Card cc1=new Master("Citi Card",500 );
        Card cc2=new Visa("Chase", 750);
        Card cc3=new AmeX("American Express", 1000);

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(cc1);
        cards.add(cc2);
        cards.add(cc3);

        for (int i=0; i<cards.size(); i++){
            cards.get(i).payBill();
            System.out.println();

        }
    }
}
    class Card{
        String ccName;
        int amount;
        Card(String ccName,int amount){
            this.ccName=ccName;
            this.amount=amount;
        }
        void payBill(){
            System.out.println("You need to pay your due bill the amount is "+ amount+ " for your credit card "+ ccName);
        }
        void ccInfo(){

        }

    }
    class Master extends Card{

        Master(String ccName, int amount) {
            super(ccName, amount);
        }
    }
    class Visa extends Card{

        Visa(String ccName, int amount) {
            super(ccName, amount);
        }
    }
    class AmeX extends Card{

        AmeX(String ccName, int amount) {
            super(ccName, amount);
        }
    }

