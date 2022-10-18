package class21;

public class Animal {
    String name;
    String color;
    String breed;
    void sleep(){
        System.out.println("Animals usually sleep for 6 hours");
    }
    void eat(){
        System.out.println("Grass and meat");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println("I like to sleep for 20 hours");
    }
    void eat() {
        System.out.println("I only like fish");
    }
}
class Dog extends Animal{
    void sleep(){
        System.out.println("I like to sleep for 10 hours");
    }
    void eat() {
        System.out.println("Dogs like meat");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();

        Dog d=new Dog();
        d.eat();
    }
}
