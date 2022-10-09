package class18;

public class Task3Revise {
    private Task3Revise(){
        System.out.println("private");
    }

    Task3Revise(String name){
        System.out.println("Default");
    }

    protected Task3Revise(int age){
        System.out.println("protected");
    }
    public Task3Revise(boolean isTrue){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3Revise();
        new Task3Revise("Thank you Lubna");
        new Task3Revise(10);
        new Task3Revise(true);
    }

}
