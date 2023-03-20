package com.final_project.pages;

import com.final_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotePage {

    public NotePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   // @FindBy(xpath = "//input[@name='user']")
    @FindBy( id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(id="app-dashboard")
    public WebElement dashboard;

    @FindBy(xpath = "//a[@href=\"/index.php/apps/notes/\"]")
    public WebElement notesIcon;

   // @FindBy(xpath = "//button[@class='icon-add']")
    @FindBy(id="notes_new_note")
    public WebElement newNoteBtn;

    @FindBy(xpath = " //pre[@class=' CodeMirror-line '] ")
    public WebElement writingArea;

    @FindBy(xpath = "//span[@title='Hello World!']")
    public WebElement firstWords;



}
