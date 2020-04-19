package com.AutomatedTest.UI_Test.Step_definition;

import com.AutomatedTest.UI_Test.Page.BasePage;
import com.AutomatedTest.UI_Test.Page.NewUserAndFilter;
import com.AutomatedTest.UI_Test.Utils.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.logging.Logger;

public class NewUser_Step {


    NewUserAndFilter newUserAndFilter = new NewUserAndFilter();

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        String actual = MyDriver.get().getTitle();
        String expected = "Dashboard | Active Admin Depot";
        Assert.assertEquals(expected, actual);
    }

    @Then("user click the Users button")
    public void user_click_the_Users_button() {

        newUserAndFilter.verifyclickUsersButton();
    }

    @Then("user click new user button")
    public void user_click_new_user_button() {

        newUserAndFilter.verifyclickNewUser();
    }

    @Then("user enter {string} as {string}")
    public void user_enter(String string, String string2) {
        BasePage.threadWait();
        newUserAndFilter.VerifyEnterUsernamePasswordAndEmail(string, string2);
    }

    @Then("user click {string} button")
    public void user_click_button(String string) {
        newUserAndFilter.verifyCreateUserButton();
        BasePage.threadWait();
    }

    @Then("user select {string} and enters {string} from {string}")
    public void user_select_and_enters(String dropdown, String text,String string) {

    newUserAndFilter.verifyFiltersWithUsername(dropdown,text,string);
    }

    @Then("user click Filter button")
    public void user_click_Filter_button() {

    }

}
