package class14;

import java.util.Scanner;

public class MethodDemo3 {

    boolean isEven(int number){
        if(number%2==0){
            return true;
        }  else {
            return false;
        }
    }

    public static void main(String[] args) {

        MethodDemo3 md=new MethodDemo3();

        if(md.isEven(4)){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is odd");
        }

    }
}
