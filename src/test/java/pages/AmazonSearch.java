package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonSearch {

    WebDriver driver;

    public AmazonSearch(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement AmazonsearchButton;

    @FindBy(xpath = "//a[@id='bcKwText']/span")
    public WebElement searchedItem;


}
