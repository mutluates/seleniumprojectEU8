package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWaitPractice {


    @Test
    public void web_driver_wait_test(){

        // TC#4 : Dynamically Loaded Page Elements 7
        //  1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get(" https://practice.cydeo.com/dynamic_loading/7");

        //  2. Wait until title is “Dynamic title”

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        // Create object of Dynamicload7Page to reach and assert web elements
        DynamicLoad7page dynamicLoadPage= new DynamicLoad7page();

        //  3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoadPage.doneMessage.isDisplayed());

        //  4. Assert: Image is displayed.
        BrowserUtils.sleep(2);
        Assert.assertTrue(dynamicLoadPage.spongePants.isDisplayed());

    }

    @Test
    public void dynamic_load_1_test(){

        // TC#5 : Dynamically Loaded Page Elements 1
        // 1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        // Create DynamicLoad1Page class
        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();

        // 2. Click to start
        dynamicLoad1Page.startButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));

        // 3. Wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        // 4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

        // 5. Enter username: tomsmith
        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

        // 6. Enter password: incorrectpassword
        dynamicLoad1Page.inputPassword.sendKeys("sometingwrong");

        // 7. Click to Submit button
        BrowserUtils.sleep(2);
        dynamicLoad1Page.submitButton.click();

        // 8. Assert “Your password is invalid!” text is displayed
        Assert.assertTrue(dynamicLoad1Page.invalidMessage.isDisplayed());

    }


}
