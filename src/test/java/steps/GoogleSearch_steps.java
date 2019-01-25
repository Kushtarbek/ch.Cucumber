package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearch_steps {

    GooglePage gpObject = new GooglePage();

    @Given("User in on the google homepage")
    public void user_in_on_the_google_homepage() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Given("User enters flowers")
    public void user_enters_flowers() {
        gpObject.searchBox.sendKeys("flowers");
    }

    @Given("USer clicks search button")
    public void user_clicks_search_button() {
        gpObject.getSearchButton.click();

    }

    @Then("User shoul see results related to flowers")
    public void user_shoul_see_results_related_to_flowers() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue("Title check failed",Driver.getDriver().getTitle().equals(title));
    }




}
