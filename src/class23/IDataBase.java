package class23;

public interface IDataBase {

    int age=10;
    void openDatabase();
    void readData();
    void writeData();
}
class IBM implements IDataBase {


    @Override
    public void openDatabase() {
        System.out.println("Opening the IBM database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM Database");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the data to the database");
    }

}
class InterfaceTester {
    public static void main(String[] args) {
        IDataBase iDataBase = new IBM();
        iDataBase.openDatabase();
        iDataBase.readData();
        iDataBase.writeData();


    }

}

