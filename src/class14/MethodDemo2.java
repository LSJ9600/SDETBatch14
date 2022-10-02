package class14;

public class MethodDemo2 {

    void printManyTimes(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello Java");
        }
    }

    // in Parameters sequence and data type matters

    void printCustomWordManyTimes(String word, int times) {

        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        MethodDemo2 md = new MethodDemo2();
        md.printManyTimes(5);
        md.printCustomWordManyTimes("Syntax Easy", 2);

    }
}
