package Review;

public class StringMethod {

    public static void main(String[] args) {

    String str = "hello";
    //toUpperCase or toLowerCase
        str.toUpperCase();
        System.out.println(str); //hello
        System.out.println("========================");
    str = str.toUpperCase();
        System.out.println(str); //HELLO
        System.out.println("=============================");
    //length() -> gives size. Returns the length of this string.
    int size = str.length();
        System.out.println(size);
        System.out.println("=============================");
    // charAt() -> Returns a char value at the specified index
    char letter = str.charAt(0);
        System.out.println(letter);//H
        System.out.println("=======================");
    // how to get last character
    char lastCharacter = str.charAt(str.length() - 1);
        System.out.println(lastCharacter);//0
        System.out.println("======================");
    //indexOf ----->Returns the index within this string of the first occurrence of the specified character.
    int index = str.indexOf(lastCharacter);
        System.out.println(index);//4
        System.out.println(str.indexOf('e')); //-1
        System.out.println(str);
}
}
