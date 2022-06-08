package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractice {

    LibraryLoginPage libraryloginPage;

    @BeforeMethod
    public void setupMethod(){

        Driver.getDriver().get("https://library1.cydeo.com");
        libraryloginPage = new LibraryLoginPage();

    }

    @Test
    public void required_field_error_message_test(){

        // TC #1: Required field error message test
        // 1- Open a chrome browser
        // 2- Go to: https://library1.cydeo.com
        // 3- Do not enter any information
        // 4- Click to “Sign in” button

        libraryloginPage.signButton.click();

        // 5- Verify expected error is displayed:
        // Expected: This field is required.
        Assert.assertTrue(libraryloginPage.fieldRequiredMessage.isDisplayed());

        //NOTE: FOLLOW POM DESIGN PATTERN

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){

        // TC #2: Invalid email format error message test
        // 1- Open a chrome browser
        // 2- Go to: https://library1.cydeo.com
        // 3- Enter invalid email format
        libraryloginPage.inputUsername.sendKeys("somethingworng");

        libraryloginPage.signButton.click();

        // 4- Verify expected error is displayed:
        //    Expected: Please enter a valid email address.

        Assert.assertTrue(libraryloginPage.enterValidEmailMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void library_negative_login_test(){

        // TC #3: Library negative login
        // 1- Open a chrome browser
        // 2- Go to: https://library1.cydeo.com
        // 3- Enter incorrect username or incorrect password
        libraryloginPage.inputUsername.sendKeys("wrong@username.com");
        libraryloginPage.inputPassword.sendKeys("wrongpassword");

        libraryloginPage.signButton.click();

        // 4- Verify title expected error is displayed:
        //  Expected: Sorry, Wrong Email or Password

        Assert.assertTrue(libraryloginPage.wrongEmailMessage.isDisplayed());
        Driver.closeDriver();


    }

}
