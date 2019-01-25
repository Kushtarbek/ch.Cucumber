package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class AmazonTitle_steps {

    @When("user goes to amazon.com")
    public void user_goes_to_amazon_com() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    @Then("user should see Amazon.com: Online Shopping")
    public void user_should_see_Amazon_com_Online_Shopping() {
        String title = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(Driver.getDriver().getTitle(), title);
        Driver.closeDriver();
    }

    @Then("user should be able to click on DropDown")
    public void user_should_be_able_to_click_on_DropDown() {
        System.out.println("test");

    }

    @Then("user should validate url")
    public void user_should_validate_url() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon.com"));
    }




}
