package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YoutubeSeach;
import utilities.Driver;

public class Youtube_steps {

    YoutubeSeach yObject = new YoutubeSeach();

    @Given("User is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("https://www.youtube.com/");
    }


    @Given("User is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
        Assert.assertTrue(yObject.searchbox.isDisplayed());
        System.out.println(yObject.searchbox.isDisplayed());
    }

    @Given("User is able to see the search button")
    public void user_is_able_to_see_the_search_button() {
       Assert.assertTrue(yObject.button.isDisplayed());
        System.out.println(yObject.button.isDisplayed());
    }

    @When("user searches for Funny Cat Videos")
    public void user_searches_for_Funny_Cat_Videos() throws InterruptedException {
        Thread.sleep(2000);
        yObject.searchbox.sendKeys("Funny cat videos"+ Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("User shold see results related to funny cats")
    public void user_shold_see_results_related_to_funny_cats() {
        String actual = Driver.getDriver().getTitle();
        String expected = "cat";

        Assert.assertTrue("Does not contain", actual.contains(expected) );
    }



}
