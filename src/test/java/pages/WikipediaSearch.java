package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediaSearch {

    WebDriver driver;

   public WikipediaSearch(){
       driver= Driver.getDriver();
       PageFactory.initElements(driver, this);

   }
    @FindBy(xpath = "//*[@id='firstHeading']")
    public WebElement firstHeading;

   @FindBy(xpath = "//input[@name='search']")
    public WebElement searchBox;
   @FindBy(xpath = "//input[@name='go']")
    public WebElement submitButton;


}
