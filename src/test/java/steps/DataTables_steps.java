package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.DataTables;
import utilities.Driver;

public class DataTables_steps {

    DataTables dObj = new DataTables();
     //Faker fakeData = new Faker();
   public  String fname = "john";

    public  String lname = "doe";

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @And("User clicks to New Button")
    public void user_clicks_to_New_Button() {
        dObj.NewButton.click();
    }

    @Then("User should see Create Entry Box")
    public void user_should_see_Create_Entry_Box() {
        Assert.assertTrue(dObj.FirstName.isDisplayed());
        System.out.println(dObj.FirstName.isDisplayed());
    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {

        dObj.FirstName.sendKeys(fname);
        System.out.println(fname);
    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {

        dObj.LastName.sendKeys(lname);
        System.out.println(lname);
    }

    @Then("User should enter position")
    public void user_should_enter_position() {

        String position = "SDET";
        dObj.position.sendKeys(position);
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
       String office = "London";
        dObj.office.sendKeys(office);
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
       //Faker fakes = new Faker();
        String extension = "345";
       dObj.extension.sendKeys(extension);
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
      //Faker fake = new Faker();
        String date = "2019-04-23";
      dObj.startDate.sendKeys(date);
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        //Faker fa = new Faker();
        String salary = "125000";
        dObj.salarybox.sendKeys(salary);
    }

    @Then("User should click to Create Button")
    public void user_should_click_to_Create_Button() {
        dObj.CreateButton.click();
    }

    @Then("User enters firstname to Search Box")
    public void user_enters_firstname_to_Search_Box() {
    dObj.searchbox.sendKeys(fname);
    }

    @Then("User should see first name inserted in the table")
    public void user_should_see_first_name_inserted_in_the_table() {
        System.out.println(fname+" "+lname);
       Assert.assertTrue(dObj.NameInTheBox.getText().contains(fname));

    }

}
