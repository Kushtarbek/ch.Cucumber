package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_steps {

    @When("user goes to google application")
    public void user_goes_to_google_application() {
        System.out.println("selenim is going to google.com");

    }

    @Then("user searches for apple")
    public void user_searches_for_apple() {
        System.out.println("user searching for an apple");

    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        System.out.println("user sees apple related results");
        Assert.fail("failing it on purpose");

    }

    @Then("user tests something")
    public void user_tests_something() {
        System.out.println("test method");

    }



}
