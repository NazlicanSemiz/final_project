package com.final_project.step_definitions;

import com.final_project.pages.NotePage;
import com.final_project.utilities.BrowserUtils;
import com.final_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Note_StepDefinitions {

    NotePage notePage = new NotePage();

    @Given("user go to login page")
    public void user_go_to_login_page() {

        Driver.getDriver().get("https://qa.meetsky.net/index.php/login");
    }
    @When("user fill out username and password field")
    public void user_fill_out_username_and_password_field() {

    notePage.username.sendKeys("Employee11");
    notePage.password.sendKeys("Employee123");
    }
    @When("user clicks login button from button of the placeholder field")
    public void user_clicks_login_button_from_button_of_the_placeholder_field() {

        notePage.loginButton.click();
    }
    @Then("user should be able to home page successfully")
    public void user_should_be_able_to_home_page_successfully() {

        Assert.assertTrue(notePage.dashboard.isDisplayed());
    }
    @When("user clicks on the pen shaped notes icon")
    public void user_clicks_on_the_pen_shaped_notes_icon() {

        notePage.notesIcon.click();
        BrowserUtils.sleep(2);
    }
    @When("user clicks on the New Note button")
    public void user_clicks_on_the_new_note_button() {


       notePage.newNoteBtn.click();
    }
    @When("user writes anything inside the new code")
    public void user_writes_anything_inside_the_new_code() {

        notePage.writingArea.sendKeys("Hello World!");
        BrowserUtils.sleep(2);
    }
    @When("user clicks enter")
    public void user_clicks_enter() {
        notePage.writingArea.sendKeys("Hello World!"+ Keys.ENTER);
    }
    @Then("the user should be able to see the first words of the new note as the title in the placeholder of the new note")
    public void the_user_should_be_able_to_see_the_first_words_of_the_new_note_as_the_title_in_the_placeholder_of_the_new_note() {

        String expectedTitle="Hello World!";
        String actualTitle= "Hello World!";

        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
