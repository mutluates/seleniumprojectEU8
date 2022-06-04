package com.cydeo.tests.homeWorks;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeTask {

    @Test
    public void iframeTes(){

        String browserType = ConfigurationReader.getProperty("browser");
        WebDriver driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        ReviewUtils.staticWait(2);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

        WebElement demoElement = driver.findElement(By.id("demo"));

        System.out.println("demoElement.getText() = " + demoElement.getText());

        driver.close();


    }

}
