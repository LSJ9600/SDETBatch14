package class18;

public class Hw2 {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String name;
    String author;
    int releaseYear;

    public Hw2(String name, String author) {
        this.name = name;
        this.author = author;
        System.out.println("The name of the book is " + name +" written by " + author);
    }
    public Hw2(int releaseYear) {
        this.releaseYear = releaseYear;
        System.out.println("It was published in the year " + releaseYear);
    }
    public static void main(String[] args) {
        Hw2 book1=new Hw2("The Polar Express", "Chris Van Allsburg");
        Hw2 book2=new Hw2(1985);
    }
}
