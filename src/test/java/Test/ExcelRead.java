package Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExcelRead {
    public static void main(String[] args) throws Exception {
        File file  = new File("src/SampleData.xlsx");
        System.out.println(file.exists());

        //Opening & reading the file
        FileInputStream inputStream = new FileInputStream(file);

        //loading into the class
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet worksheet = workbook.getSheet("Employees");
        System.out.println(worksheet.getRow(2).getCell(1));
        System.out.println(worksheet.getRow(5).getCell(0));


        //lastUserRow counts by index

        int usedRows = worksheet.getPhysicalNumberOfRows();
        int lastUsedRow = worksheet.getLastRowNum();
        System.out.println("PhysicalNumberOfRows: "+usedRows);
        System.out.println("lastUsedRow: "+lastUsedRow);


        //TODO: PRINT OUT NANCY'S JOB_ID DYNAMICALLY



//TODO
           for(int rowNumber =0; rowNumber<=usedRows;rowNumber++){
               if(worksheet.getRow(rowNumber).getCell(0).toString().equals("Nancy")){
                   System.out.println("Nancy's job title: "+worksheet.getRow(rowNumber).getCell(2));
                   break;
               }

        }
        String lastName = Config.getProperty("lastName");
        for(int i=0; 0<=usedRows;i++){
            if(worksheet.getRow(i).getCell(1).toString().equals(lastName)){
                System.out.print("Info: First Name is "+worksheet.getRow(i).getCell(0)
                        + "lastName" +worksheet.getRow(i).getCell(1)
                        + "JobID "+worksheet.getRow(i).getCell(2));
                break;

            }
        }
        //when you are done with everything
        workbook.close();
           inputStream.close();
    }
}
