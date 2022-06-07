package com.cydeo.tests.day10_upload_action_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_Upload_Practice {


    @Test
    public void upload_test(){

        // TC #2 Upload Test
        // 1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        // 2. Find some small file from your computer, and get the path of it.
        String path ="E:\\Mesut\\profil\\white rose.jpg";


        // 3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@value='Upload']"));
        uploadButton.click();

        // 4. Assert:
        //   -File uploaded text is displayed on the page

        WebElement uploadHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(uploadHeader.isDisplayed());


    }

}
