package class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hw1 {
    public static void main(String[] args) {
        /*
        Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
        getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute
        as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them
        in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
         */
        Insurance car1=new Car("Car Insurance","Audi");
        Insurance pet1=new Pet("Pet Insurance", "Cat");
        Insurance health1=new Health("Health Insurance", "Full body");

        ArrayList<Insurance> insure=new ArrayList<>();
        insure.add(car1);
        insure.add(pet1);
        insure.add(health1);

        for (int i=0; i<insure.size(); i++){
            insure.get(i).getQuote();
            insure.get(i).cancelInsurance();
            System.out.println();

        }
    }
}
    class Insurance {
        String insuranceName;

        void getQuote() {
            System.out.println();
        }

        void cancelInsurance() {
            System.out.println("You have canceled your insurance for "+ insuranceName);
        }

        Insurance(String insuranceName) {
            this.insuranceName = insuranceName;
        }
    }
    class Car extends Insurance{
           String carModel;

        Car(String insuranceName,String carModel) {
            super(insuranceName);
            this.carModel=carModel;
        }
        void getQuote() {
            System.out.println("The quote for your "+ carModel+ " will be $500 per month");
        }
    }
    class Pet extends Insurance{
           String petType;

        Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType=petType;
        }
        void getQuote() {
            System.out.println("The quote for your "+ petType + " will be $350 per month");
        }
    }
    class Health extends Insurance{
        String healthType;
        Health(String insuranceName, String healthType) {
            super(insuranceName);
            this.healthType=healthType;
        }
        Health(String insuranceName) {
            super(insuranceName);
        }
        void getQuote() {
            System.out.println("The quote for your "+ healthType  + " will be $450 per month");
        }
    }


