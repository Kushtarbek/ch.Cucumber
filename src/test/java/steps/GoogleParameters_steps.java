package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;
import utilities.Driver;

public class GoogleParameters_steps {

    GooglePage gObj = new GooglePage();



    @Given("User is on google homepage")
    public void user_is_on_google_homepage() {
        Driver.getDriver().get("https://google.com");
    }

    @When("User enters {string}")
    public void user_enters(String phones) {
       gObj.searchBox.sendKeys(phones);
    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {

    }

}
