package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC7_Selecting_value {

    @Test
    public void Selecting_value_from_non_select_dropdown() throws InterruptedException {

        //TC #7: Selecting value from non-select dropdown
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

        //3. Click to non-select dropdown
        WebElement nonSelectButton = Driver.getDriver().findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectButton.click();
        Thread.sleep(3000);

        //4. Select Facebook from dropdown
        WebElement faceBookObtion = Driver.getDriver().findElement(By.xpath("//a[text()='Facebook']"));
        faceBookObtion.click();


        //5. Verify title is “Facebook - Log In or Sign Up”
        //String expectedTitle = "Facebook - log in or sign up";
        //String actualTitle = Driver.getDriver().getTitle();

        //Assert.assertEquals(expectedTitle,actualTitle,"Title verification failed");


    }


}
