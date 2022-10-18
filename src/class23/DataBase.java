package class23;

public abstract class DataBase {
    abstract void openDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
class MicrosoftDataBase extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("Opening the Microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Microsoft Database");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to Microsoft Database");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Microsoft Database");
    }
}

class Oracle extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("Opening the Oracle Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle Database");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to Oracle Database");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Oracle Database");
    }
}

class DataBaseTester{
    public static void main(String[] args) {
        DataBase db=new MicrosoftDataBase(); //simply now change the class name to which you want and it will change
        db.openDatabase();
        db.readData();
        db.writeData();
        db.closeDatabase();
    }
}
