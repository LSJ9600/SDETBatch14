package class22;

public class FinalDemo {
    public static void main(String[] args) {
        Phone phone=new Phone();
        //   phone.RAM=50;

    }
}

final class  Phone{
    final int RAM=12;

    void takePics(){
        final int number=10;

    }
}

/*
class Iphone extends Phone{
    void takePics(){
    }
}
*/