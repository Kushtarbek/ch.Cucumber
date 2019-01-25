package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.DataTables;

public class DataTables2_steps {

     DataTables dObj = new DataTables();



    @Then("User should enter firstname {string}")
    public void user_should_enter_firstname(String fisrtName) throws InterruptedException {
        Thread.sleep(500);
        dObj.FirstName.sendKeys(fisrtName);

    }

    @Then("User should enter lastname {string}")
    public void user_should_enter_lastname(String lastName) throws InterruptedException {
        Thread.sleep(500);
        dObj.LastName.sendKeys(lastName);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) throws InterruptedException {
        Thread.sleep(500);
        dObj.position.sendKeys(position);
    }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String office) throws InterruptedException {
        Thread.sleep(500);
        dObj.position.sendKeys(office);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String extension) throws InterruptedException {
        Thread.sleep(500);
        dObj.extension.sendKeys(extension);
    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String startdate) throws InterruptedException {
        Thread.sleep(500);
        dObj.startDate.sendKeys(startdate);
    }

    @Then("User should enter salary {string}")
    public void user_should_enter_salary(String salary) throws InterruptedException {
        Thread.sleep(500);
        dObj.salarybox.sendKeys(salary);
    }




    @Then("User should see first name is {string} inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String expectedName) throws InterruptedException {
        String expected = expectedName;
        Thread.sleep(500);
        String actual  = dObj.NameInTheBox.getText();

        Assert.fail();
        Thread.sleep(500);
        Assert.assertTrue("name was not found", actual.contains(expected));
    }






}
