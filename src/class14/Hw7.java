package class14;

public class Hw7 {

    /*Create  class Student that will have a method getGrade. Your method should accept the score
      of a student and return a grade:
      score > 90 - A
      score >80 - B
      score >70 - C
      score > 50 - D
      anything else - F
    */

    char grade= '0';

    void score(int num){
        if (num>90){
            grade='A';
        }else if (num>80) {
            grade='B';
        }else if (num>70) {
            grade = 'C';
        }else if (num>50) {
            grade = 'D';
        }else {
            grade= 'F';
        }
        System.out.println(grade);
    }

    public static void main(String[] args) {

        Hw7 hw=new Hw7();
        hw.score(85);
    }
}
