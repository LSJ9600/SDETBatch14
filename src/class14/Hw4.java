package class14;

public class Hw4 {

    // Create a method that will say Hello in different language
    // based on the country that will passed when method is executed

    String hello (String country) {
        String speak;

        if (country.equalsIgnoreCase("India")) {
            speak = "नमस्ते";
        } else if (country.equalsIgnoreCase("China")) {
            speak = "你好";
        } else if (country.equalsIgnoreCase("Saudi Arabia")) {
            speak = "أهلا";
        } else {
            speak = "Unknown";
        }
        return speak;
    }

    public static void main(String[] args) {

        Hw4 hw = new Hw4();
        System.out.println("hello " + hw.hello("China"));
    }

}

