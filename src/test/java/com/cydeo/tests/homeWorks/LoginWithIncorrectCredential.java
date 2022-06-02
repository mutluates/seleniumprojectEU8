package com.cydeo.tests.homeWorks;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import dev.failsafe.internal.TimeoutImpl;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginWithIncorrectCredential {

       public WebDriver driver;

    @Test
    public void login_with_Incorrect_Credential(){
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        // 3. Verify that home page is visible successfully
         String expectedHomePage = "Automation Exercise";

         String actualHomePage = driver.getTitle();

         Assert.assertEquals(actualHomePage,expectedHomePage);

        // 4. Click on 'Signup / Login' button
         WebElement signupButton = driver.findElement(By.xpath("//header[@id='header']/div/div/div/div[2]/div/ul/li[4]"));
         signupButton.click();

        // 5. Verify 'Login to your account' is visible

         WebElement loginToYourAccount = driver.findElement(By.xpath("//h2[text()='Login to your account']"));

         Boolean loginVerfy =  driver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed();

         System.out.println("loginVerfy = " + loginVerfy);


        // 6. Enter incorrect email address and password
         WebElement usernameInput = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]"));
         usernameInput.sendKeys("makbas@gmail.com");

         WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
         passwordInput.sendKeys("wrongpassword");

        // 7. Click 'login' button
         WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
         loginButton.click();


        // 8. Verify error 'Your email or password is incorrect!' is visible
         WebElement errorMessage = driver.findElement(By.xpath("//p[@style='color: red;']"));

         Boolean loginMessage = driver.findElement(By.xpath("//p[@style='color: red;']")).isDisplayed();




    }

}
