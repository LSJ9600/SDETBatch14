package class17;

public class Hw1 {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.

    private String make;
    private String model;
    private String color;
    private int storage;

    public Hw1 (String make, String model, String color, int storage) {
        this.make= make;
        this.model = model;
        this.color = color;
        this.storage = storage;
    }

    public Hw1 (){

    }


     void call() {
        System.out.println("calling......");
    }
    void takePicture() {
        System.out.println("Taking pictures");
    }
}
