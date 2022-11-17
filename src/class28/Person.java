package class28;

import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;

public class Person {
        /*
        Create a Person class with following private fields: name, lastName, age, salary.
        Variables should be initialized through constructor.
        Inside the class also create a method to print user details.
        In Test Class create a Map that will store key in ascending order. In that map store personId and a Person
        Object. Print each object details.
         */
        private String name;
        private String lastName;
        private int age;
        private double salary;
    public Person(String name, String lastName, int age, double salary){
            this.name=name;
            this.lastName=lastName;
            this.age=age;
            this.salary=salary;
        }
        @Override
        public String toString() {
            return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                    .add("name='" + name + "'")
                    .add("lastName='" + lastName + "'")
                    .add("age=" + age)
                    .add("salary=" + salary)
                    .toString();
        }
    }

class Hw4{
        public static void main(String[] args) {

            Map<Integer, Person> employee = new TreeMap<>();
            employee.put(12, new Person("John", "Smith", 20, 100000));
            employee.put(23, new Person("Jolly", "Dolly", 21, 110000));
            employee.put(34, new Person("James", "Bond", 22, 120000));
            employee.put(45, new Person("Charlie", "Chaplin", 23, 130000));
            employee.put(56, new Person("Mary", "Love", 24, 140000));

            employee.forEach((key, value) -> {System.out.println(key + " " + value);});
        }
}