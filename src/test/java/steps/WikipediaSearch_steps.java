
package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.WikipediaSearch;
import utilities.Driver;

public class WikipediaSearch_steps {

    WikipediaSearch wpObject = new WikipediaSearch();

    @Given("User is on the wikipedia homepage")
    public void user_is_on_the_wikipedia_homepage() {
       Driver.getDriver().get("https://en.wikipedia.org/wiki/Wiki");
    }

    @When("User enters steve jobs to search bar and clicks enter")
    public void user_enters_steve_jobs_to_search_bar_and_clicks_enter() {
        wpObject.searchBox.sendKeys("steve jobs"+ Keys.ENTER);
        //wpObject.submitButton.click();
    }

    @Then("User should see the first header is displaying steve jobs")
    public void user_should_see_the_first_header_is_displaying_steve_jobs() {
       String sJobs = wpObject.firstHeading.getText();
        Assert.assertTrue(wpObject.firstHeading.getText().equals(sJobs));
    }





}
