package class14;

public class Hw3 {

    //Create a method that will print whether given String is palindrome or not.

    boolean pali (String word) {
        String reverse= "";

        for(int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }

        if(reverse.equals(word)) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Hw3 hw=new Hw3();
        if (hw.pali("racecar")) {
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }

    }
}
