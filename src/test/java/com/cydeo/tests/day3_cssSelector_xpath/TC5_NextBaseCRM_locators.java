package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5_NextBaseCRM_locators {

    @Test
    public void NextBaseCRM_locators_getText(){

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
             String browserType = ConfigurationReader.getProperty("browser");
             WebDriver driver = WebDriverFactory.getDriver(browserType);
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
             driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        //3- Enter incorrect username into login box:
             WebElement loginButton = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
             loginButton.sendKeys("wrong@gmail.com");

        //4- Click to `Reset password` button
            WebElement resetButton = driver.findElement(By.xpath("//button[@value='Reset password']"));
            resetButton.click();


        //5- Verify “error” label is as expected
        //   text : Login or E-mail not found
            WebElement errorMessage = driver.findElement(By.xpath("//div[@class='errortext']"));

            String expectedErrorMessage = "Login or E-mail not found";
            String actualErrorMessage = driver.findElement(By.xpath("//div[@class='errortext']")).getText();

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);


    }


}
