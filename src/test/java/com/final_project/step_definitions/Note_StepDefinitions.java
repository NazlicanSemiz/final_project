package com.final_project.step_definitions;

import com.final_project.pages.NotePage;
import com.final_project.utilities.BrowserUtils;
import com.final_project.utilities.Driver;
import io.cucumber.java.en.And;
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
        BrowserUtils.sleep(2);
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
        BrowserUtils.sleep(2);
    }
    @Then("the user should be able to see the first words of the new note as the title in the placeholder of the new note")
    public void the_user_should_be_able_to_see_the_first_words_of_the_new_note_as_the_title_in_the_placeholder_of_the_new_note() {


        String expectedTitle="Hello World!";
        String actualTitle= notePage.writingArea.getText();

        Assert.assertEquals(expectedTitle,actualTitle);


    }



    @When("user clicks three dot icon")
    public void user_clicks_three_dot_icon() {

       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
       // wait.until(ExpectedConditions.elementToBeClickable(notePage.threeDots));
       // notePage.threeDots.click();
        BrowserUtils.sleep(7);
        BrowserUtils.clickWithJS(notePage.threeDots);


    }

    @When("user clicks on the Add to favorites option button")
    public void user_clicks_on_the_add_to_favorites_option_button() {
        BrowserUtils.sleep(15);
        notePage.addFavoritesBtn.click();
       //BrowserUtils.clickWithJS(notePage.addFavoritesBtn);

    }
    @When("user clicks on the File icon")
    public void user_clicks_on_the_file_icon() {
        BrowserUtils.sleep(7);
        notePage.fileIcon.click();

    }
    @Then("user should see All File page")
    public void user_should_see_all_file_page() {

        Assert.assertTrue(notePage.allFilePage.isDisplayed());
    }
    @When("user clicks on the Favorites option button")
    public void user_clicks_on_the_favorites_option_button() {

        BrowserUtils.sleep(7);
        notePage.favoritesBtn.click();
    }
    @Then("user should see the file that newly added to favorites list under Favorites inside the Files")
    public void user_should_see_the_file_that_newly_added_to_favorites_list_under_favorites_inside_the_files() {

    // Assert.assertTrue(notePage.favList.isDisplayed());

    }

    @When("user clicks on the three dots on the right of the page")
    public void userClicksOnTheThreeDotsOnTheRightOfThePage() {

        BrowserUtils.sleep(15);
        notePage.favThreedots.click();
        //BrowserUtils.clickWithJS(notePage.favThreedots);
    }

    @And("user clicks on the details")
    public void userClicksOnTheDetails() {
        
    }

    @Then("Verify that the note details are displayed, including the number of letters and words in the note")
    public void verifyThatTheNoteDetailsAreDisplayedIncludingTheNumberOfLettersAndWordsInTheNote() {
    }

    @When("user clicks on the Uncategorized placeholder")
    public void userClicksOnTheUncategorizedPlaceholder() {
        
    }

    @And("user writes new category name")
    public void userWritesNewCategoryName() {
        
    }

    @And("user clicks on the arrow icon")
    public void userClicksOnTheArrowIcon() {
        
    }

    @And("user clicks on the Categories file")
    public void userClicksOnTheCategoriesFile() {
        
    }

    @Then("verify that new category appears")
    public void verifyThatNewCategoryAppears() {
        
    }

    @When("user clicks on the three dots icon")
    public void userClicksOnTheThreeDotsIcon() {
        
    }

    @And("user clicks on the delete note button")
    public void userClicksOnTheDeleteNoteButton() {
        
    }

    @Then("Verify that the note is no longer displayed on the main screen.")
    public void verifyThatTheNoteIsNoLongerDisplayedOnTheMainScreen() {
    }
}
