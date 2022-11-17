package class29;

import utils.ExcelReader;
import utils.configReader;

import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {

        String path="Data/config.properties";
        var properties= configReader.read(path);
        System.out.println(properties.getProperty("browser"));

        String excelPath="Data/Quiz.xlsx";
        var excelData= ExcelReader.read(excelPath);
        System.out.print(excelData);

    }
}
