package class17;

public class Person {
    String name;
    String color;
    String country;
    int age;
    double weight;
    String hairColor;
    String eyeColor;
    double height;
    static char gender='M';


    public Person(){

    }

    public Person(String perName){
        name=perName;
    }
    public Person(String name, String color, String country, int age, double weight, String hairColor, String eyeColor, double height, char gender) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.age = age;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.gender = gender;
    }
}
