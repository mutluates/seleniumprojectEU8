package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2_ExplicitWaitPractice {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod(){
        // TC #2: Explicit wait practice
        // 1- Open a chrome browser
        // 2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_button_test(){


        // 3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        // 4- Wait until “loading bar disappears”
        Driver.getDriver().manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));

        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);  // We can implement a new method for explicitwaiting...


        // 5- Verify:
        // a. Checkbox is not displayed

        try {
            Assert.assertFalse(dynamicControlsPage.checkBox.isEnabled());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

        // b. “It’s gone!” message is displayed.

       Assert.assertTrue(dynamicControlsPage.Message.isDisplayed());
       Assert.assertTrue(dynamicControlsPage.Message.getText().equals("It's gone!"));


    }

    @Test
    public void enable_button_test(){

        //3- Click to “Enable” button
        dynamicControlsPage.enableButton.click();

        //4- Wait until “loading bar disappears”
         BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        //5- Verify:
        //a. Input box is enabled.
         Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

        //b. “It’s enabled!” message is displayed
        Assert.assertTrue(dynamicControlsPage.Message.getText().equals("It's enabled!"));

    }


}
