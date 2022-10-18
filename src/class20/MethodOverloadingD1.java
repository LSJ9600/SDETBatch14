package class20;


import java.util.Scanner;

public class MethodOverloadingD1 {

        int number;
        double dNumber;
        MethodOverloadingD1() {

        }
        MethodOverloadingD1(double dNumber) {
            this.dNumber = dNumber;
        }
        MethodOverloadingD1(int number) {
            this.number = number;
        }
        static void add(int num1, int num2) {
            System.out.println(num1 + num2);
        }
        static void add(double num1, double num2) {
            System.out.println(num1 + num2);
        }
        static void add(double num1, double num2, double num3) {
            System.out.println(num1 + num2 + num3);
        }
        public static void main(String[] args) {
            add(20, 20);
            new MethodOverloadingD1(45);
            new Scanner(System.in);
        }
}
