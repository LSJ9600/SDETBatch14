package class18;

public class Animal {
    String name;
    String breed;
    int age;
    double weight;

    void printInfo() {
        System.out.println("now this will be printed in place of name");
        System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight " + weight);
    }
}
