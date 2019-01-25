package Test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GasMileageCalculatorPage;
import utilities.Config;
import utilities.Driver;

import java.io.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class GasMileageCalculatorTest {


      GasMileageCalculatorPage gasObj;

    private WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet worksheet;
    InputStream inputStream;
    FileOutputStream fileOutputStream;

    @Before
    public void setup() throws Exception {
        driver = Driver.getDriver();
        driver.get("https://www.calculator.net/gas-mileage-calculator.html");

        inputStream = new FileInputStream(Config.getProperty("gasmileage.testdata.path"));
        workbook = new XSSFWorkbook(inputStream);
        worksheet = workbook.getSheet("Sheet1");


    }

    @Test
    public void dataDrivenMileageCalculatorTest() throws Exception {
        gasObj = new GasMileageCalculatorPage();
        for(int rowNum =1; rowNum<worksheet.getPhysicalNumberOfRows(); rowNum++) {
            XSSFRow currentRow = worksheet.getRow(rowNum);
            if(currentRow.getCell(0)==null){
                currentRow.createCell(0);
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("Skip requested!");
                continue;
            }
            else if(!currentRow.getCell(0).toString().equalsIgnoreCase("Y")){
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("Skip requested!");
                continue;
            }

            double currentOdo = currentRow.getCell(1).getNumericCellValue();
            gasObj.currentOdometerReadingInput.clear();
            gasObj.currentOdometerReadingInput.sendKeys(String.valueOf(currentOdo));
            double prevOdo = currentRow.getCell(2).getNumericCellValue();
            gasObj.prevOdometerReadingInput.clear();
            gasObj.prevOdometerReadingInput.sendKeys(String.valueOf(prevOdo));

            double gas = currentRow.getCell(3).getNumericCellValue();
            gasObj.gasAddedInput.clear();
            gasObj.gasAddedInput.sendKeys(String.valueOf(gas));
            gasObj.calculateBtn.click();

            String actualResult[] = gasObj.resultInGallon.getText().split(" ");
            System.out.println("actual"+ actualResult[0]);

            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            double expectedResult = (currentOdo - prevOdo) / gas;
            System.out.println("expected "+decimalFormat.format(expectedResult));

            if(currentRow.getCell(4)==null){
                currentRow.createCell(4);
            }
            currentRow.createCell(4).setCellValue(decimalFormat.format(expectedResult));

            if(currentRow.getCell(5)==null){
                currentRow.createCell(5);
            }
            currentRow.createCell(5).setCellValue((actualResult[0]));

            if (String.valueOf(decimalFormat.format(expectedResult)).equals(actualResult[0])) {
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("PASS!");
                System.out.println("PASS!");
            } else {
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("FAIL!");
                System.out.println("FAIL!");
            }

            if(currentRow.getCell(7)==null){
                currentRow.createCell(7);
            }
            currentRow.getCell(7).setCellValue(LocalDateTime.now().toString());
        }
        fileOutputStream = new FileOutputStream(Config.getProperty("gasmileage.testdata.path"));
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        inputStream.close();
        workbook.close();
    }
}
