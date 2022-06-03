package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWork_3 {


    public WebDriver driver;

    @Test
    public void Back_and_forth_navigation(){

        //TC #3: Back and forth navigation
        //1- Open a chrome browser

        String browserType= ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.xpath("//a[text()='Gmail']"));
        gmailButton.click();

        //4- Verify title contains:Expected: Gmail
        String expectedGmailTitle = "Gmail: Ücretsiz, Gizli ve Güvenli E-posta | Google Workspace";
        BrowserUtils.verifyTitle(driver,expectedGmailTitle);

        //5- Go back to Google by using the .back();
        driver.navigate().back();


        //6- Verify title equals:
        //  Expected: Google

        String expectedGoogleTitle = "Google";
        BrowserUtils.verifyTitle(driver,expectedGoogleTitle);


    }


}
