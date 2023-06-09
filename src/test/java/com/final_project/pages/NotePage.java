package com.final_project.pages;

import com.final_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotePage {

    public NotePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  // @FindBy(xpath = "//input[@placeholder='Username or email']")
    @FindBy( id = "user")
 //   @FindBy(xpath = "/html/body/div[1]/div/main/div/div/form/fieldset/p[1]/input ")
   // @FindBy(xpath = "//p[@class='grouptop']")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(id="app-dashboard")
    public WebElement dashboard;

    @FindBy(xpath = "//li[@data-id='notes']")
    public WebElement notesIcon;

   // @FindBy(xpath = "//button[@class='icon-add']")
    @FindBy(id="notes_new_note")
    public WebElement newNoteBtn;

    @FindBy(xpath = " //div[@class='CodeMirror-code'] ")
    public WebElement writingArea;

    //@FindBy(xpath = "//span[@title='Hello World!']")
    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public WebElement firstWords;


    @FindBy(xpath = "//ul[@class='app-navigation__list']//li[3]/div//button")
    public WebElement threeDots;

    //@FindBy(xpath = "//li[@class='action active']//button//span[2]")
    @FindBy(xpath = "//span[contains(@class,'action-button__text')]  [contains(text(),'Add to favorites')]")
    public WebElement addFavoritesBtn;

    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement fileIcon;

    @FindBy(xpath = "//div[@id='app-navigation']")
    public WebElement allFilePage;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favoritesBtn;


    //@FindBy(xpath = "//span[contains(@class,'innernametext')]  [contains(text(),'Hello World! (26)')]")
    @FindBy(xpath= "//div[@id='app-content-favorites']")
    public WebElement favList;


    @FindBy(xpath = "//*[@id=\"note-container\"]/span/div[1]/div/div/button/span")
    public WebElement favThreedots;


    @FindBy(xpath = "//span[contains(@class,'action-button__text')]  [contains(text(), 'Details')]")
    public WebElement detailsBtn;

    @FindBy(xpath = "//p[@class=\'app-sidebar-header__subtitle\']")
    public WebElement letterWordInfo;

    @FindBy(xpath = "//form[@class='category']//div[1]//input")
    public WebElement uncategorizedBtn;

    @FindBy(xpath = "//input[@class='icon-confirm loading']")
    public WebElement arrowIcon;

    @FindBy(xpath = "//span[contains(@class,'app-navigation-entry__title')]  [contains(text(), 'Categories')]")
    public WebElement categoriesFileBtn;

    @FindBy(xpath = "//ul[@class='app-navigation-entry__children']//li[3]")
    public WebElement newCategory;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[2]/div/div/div/div/button/span")
    public  WebElement finalthreeDots;

    @FindBy(xpath = "//span[contains(@class,'action-button__text')]  [contains(text(), 'Delete note')]")
    public WebElement deleteNoteBtn;

    @FindBy(xpath = "//ul[@class='app-navigation__list']")
    public WebElement allCategoriesTable;

}
