package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

public class ReportTest1 {


    @Test
    public void loginTest() {


    ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\drkus\\IdeaProjects\\chicago10cucumberjunit\\src\\test\\java\\kushu.html");
    ExtentReports extent = new ExtentReports();
    extent.attachReporter(reporter);

    ExtentTest logger = extent.createTest("mylogintest");
    logger.log(Status.INFO,"Login to my app");
    logger.log(Status.INFO,"Verify title");
    extent.flush();


}
}
