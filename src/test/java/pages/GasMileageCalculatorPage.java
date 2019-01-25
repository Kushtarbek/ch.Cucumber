package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GasMileageCalculatorPage {

    public GasMileageCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(), this);



    }

    @FindBy(id="uscodreading")
    public WebElement currentOdometerReadingInput;

    @FindBy(id="uspodreading")
    public WebElement prevOdometerReadingInput;

    @FindBy(id="usgasputin")
    public WebElement gasAddedInput;

    @FindBy(xpath="(//input[@value='Calculate'])[1]")
    public WebElement calculateBtn;

    @FindBy(xpath = "//b[contains(text(), 'miles per gallon')]")
    public WebElement resultInGallon;

}
