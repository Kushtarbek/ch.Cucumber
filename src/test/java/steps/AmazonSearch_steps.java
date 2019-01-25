package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.AmazonSearch;
import utilities.Driver;

public class AmazonSearch_steps {

    AmazonSearch asObj = new AmazonSearch();

    @Given("User is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=221754819012&hvpos=1t1&hvnetw=g&hvrand=10196241117410874035&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9021468&hvtargid=kwd-327061083&ref=pd_sl_77c6ab3z0e_e");
    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
     asObj.searchBox.sendKeys("headphones");
    }

    @When("User clicks to amazon search button")
    public void user_clicks_to_amazon_search_button() {
        asObj.AmazonsearchButton.click();
    }

    @Then("User shold see results related")
    public void user_shold_see_results_related() {
        String actualText = asObj.searchedItem.getText();
        Assert.assertTrue("The headphones wasn't identified", actualText.contains("headphones"));
    }

}
