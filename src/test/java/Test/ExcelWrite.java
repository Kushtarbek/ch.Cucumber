package Test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook;
        XSSFSheet worksheet;
        XSSFRow row;
        XSSFCell cell;

        String path = "C:\\Users\\drkus\\Desktop\\SampleData.xlsx";
        File file = new File(path);
        FileInputStream inputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(inputStream);
        worksheet = workbook.getSheet("Employees");
        row = worksheet.getRow(4);
        cell = row.getCell(0);
        System.out.println(cell.toString());

        XSSFCell adamCell = worksheet.getRow(5).getCell(0);
        System.out.println("Before "+adamCell);
        adamCell.setCellValue("Trump");
        FileOutputStream outputStream = new FileOutputStream(path);

        System.out.println("After "+adamCell);





        //TODO:  Change Job_ID to TRUMP to "President", Dynamically

        for(int i =0; i<=worksheet.getPhysicalNumberOfRows(); i++){
            if(worksheet.getRow(i).getCell(0).toString().equals("Trump")){
                worksheet.getRow(i).getCell(2).setCellValue("changed");

                System.out.println(worksheet.getRow(i).getCell(2));
                break;



            }
        }
        workbook.write(outputStream);




        inputStream.close();
        outputStream.close();
        workbook.close();

    }
}
