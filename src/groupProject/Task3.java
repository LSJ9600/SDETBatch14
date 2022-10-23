package groupProject;

public class Task3 {
    /*
    Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
    which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation
    of calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then
    returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it's own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
    public static void main(String[] args) {
        Sedan s=new Sedan();
        System.out.println("Sedan's price is "+ s.calculateSalePrice(50000,17,"Black"));

        Truck t=new Truck();
        System.out.println("Truck price is "+ t.calculateSalePrice(45000,2100,"Red"));
    }
}
class Car{
    double carPrice;
    String color;
    double calculateSalePrice(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
        return carPrice;
    }
}
class Sedan extends Car{
    double length;
    double sPrice;
    double calculateSalePrice(double sPrice,double length,String color) {
        this.sPrice=sPrice;
        this.length=length;
        this.color=color;
        if (length > 20) {
            carPrice = (sPrice * 0.95);
        } else {
            carPrice = (sPrice * 0.90);
        }return carPrice;
    }
}
class Truck extends Car {
    double weight;
    double tPrice;
    double calculateSalePrice(double tPrice,double weight,String color) {
        this.tPrice=tPrice;
        this.weight = weight;
        this.color=color;
        if (weight > 2000) {
            carPrice = (tPrice * 0.90);
        } else {
            carPrice = (tPrice * 0.80);
        }
        return carPrice;
    }
}