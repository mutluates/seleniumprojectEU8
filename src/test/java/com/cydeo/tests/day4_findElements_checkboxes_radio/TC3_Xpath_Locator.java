package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_Xpath_Locator {

    @Test
    public void Xpath_Locator(){

        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        //2. Go to http://practice.cydeo.com/multiple_buttons
        Driver.getDriver().get("http://practice.cydeo.com/multiple_buttons");


        //3. Click on Button 1
        WebElement buttonOne = Driver.getDriver().findElement(By.xpath("//button[text()='Button 1']"));
        buttonOne.click();


        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”

        WebElement resultText= Driver.getDriver().findElement(By.xpath("//p[@id='result']"));

        String expectedResultText = "Clicked on button one!";
        String actualResultText = resultText.getText();

        Assert.assertEquals(expectedResultText,actualResultText);

    }


}
