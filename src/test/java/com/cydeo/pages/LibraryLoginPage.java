package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    // #1 initialize the driver instance and object of the class

    public LibraryLoginPage() {
    /*   initElements method will create connection in between the current
    driver session(instance) and the object of the current class.  */

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement signButton;

    @FindBy(xpath = "//div[text()='This field is required.']")
    public WebElement fieldRequiredMessage;

    @FindBy(xpath = "//div[text()='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailMessage;

    @FindBy(xpath = "//div[text()='Please enter a valid email address.']")
    public WebElement enterValidEmailMessage;



}
