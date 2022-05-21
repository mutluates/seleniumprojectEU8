package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_Alert_Practices {

    public  WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #1: Information alert practice
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");



    }

    @Test
    public void alert_test1() throws InterruptedException {

        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();
        Thread.sleep(2000);


        // to be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();


        //5. Verify “You successfully clicked an alert” text is displayed
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result test is NOT as expected !!!");


    }

    @Test
    public void alert_test2() throws InterruptedException {

        //TC #2: Confirmation alert practice

        //3. Click to “Click for JS Confirm” button
        WebElement informationConfirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

        informationConfirmButton.click();
        Thread.sleep(2000);

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();


        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"You clicked: Ok");

        String expectedResult = "You clicked: Ok";
        String actualResult = resultText.getText();

        Assert.assertEquals(actualResult,expectedResult,"Actual result test is NOT as expected !!!");


    }

    @Test
    public void allert_test3() throws InterruptedException {

        //TC #3: Information alert practice

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        //3. Click to “Click for JS Prompt” button
        WebElement informationPromptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        informationPromptButton.click();
        Thread.sleep(2000);

        //4. Send “hello” text to alert
        Alert alert =driver.switchTo().alert();
        alert.sendKeys("hello");


        //5. Click to OK button from the alert
        alert.accept();

        //6. Verify “You entered:  hello” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed());

        String expectedResult = "You entered: hello";
        String actualResult = resultText.getText();

        Assert.assertEquals(actualResult,expectedResult,"Actual test result is NOT as expected");


    }




    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }




}
