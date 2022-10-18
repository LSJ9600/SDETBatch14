package class23;

public class Hw1 {
    /*
    Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented
    method while open is an abstract. Create 3 subclasses: JavaFile, WordFile,PdfFile
    that will provide specific implementation of open behaviour: Example: to open .java file we need
    notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    public static void main(String[] args) {
        File f1=new JavaFile();
        f1.open();
        f1.edit();
        f1.close();
        System.out.println("======================");
        File f2=new WordFile();
        f2.open();
        f2.edit();
        f2.close();
        System.out.println("======================");
        File f3=new PdfFile();
        f3.open();
        f3.edit();
        f3.close();
    }
}
abstract class File {
    abstract void open();
    void edit(){
        System.out.println("You can edit the file.");
    }
    void close(){
        System.out.println("Closing the file.");
    }
}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("To open JavaFile you need to have Java Runtime Environment installed.");
    }
    void edit(){
        System.out.println("You can edit the file.");
    }
    void close(){
        System.out.println("Closing the file.");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("To open WordFile you need to open the file tab and search for the file.");
    }
    void edit(){
        System.out.println("You can edit the file.");
    }
    void close(){
        System.out.println("Closing the file.");
    }
}
class PdfFile extends File{

    @Override
    void open() {
        System.out.println("To open PdfFile you need to download a PDF reader.");
    }
    void edit(){
        System.out.println("You can edit the file.");
    }
    void close(){
        System.out.println("Closing the file.");
    }
}