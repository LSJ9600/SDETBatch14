package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {

        //Mostly used class newer better faster
        //StringBuilder str1=new StringBuilder("Today is java class");

        // older one slow and not used mostly
        //StringBuffer str2=new StringBuffer("Today is java class");

        String str3="Java is very easy";
        //If we want to convert the String to a StringBuilder we can use the below syntax

        StringBuilder str4=new StringBuilder(str3);
        System.out.println("stringBuilder1 = " + str4);

        //IF we want to convert from a StringBuilder to A String we can use the below syntax
        //String str5=str4.toString();

    }
}
