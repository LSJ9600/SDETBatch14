package class18;

public class Horse extends Animal{

    public Horse(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println("now this will be printed in place of name");
        System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight " + weight);
    }

    public static void main(String[] args) {
        Horse horseObject=new Horse("Sprit", "Stallion", 20, 400);
        horseObject.printInfo();
    }
}
