package class29;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingFileExcelDemo2 {
    public static void main(String[] args) throws IOException {

        var excelData=ExcelReader.read("/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx");
        System.out.println(excelData);
    }
}
