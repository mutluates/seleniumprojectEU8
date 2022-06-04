package com.cydeo.tests.homeWorks;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.ReviewUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTask {

    @Test
    public void alertTest(){
       // WebDriver driver = WebDriverFactory.getDriver("chrome"); this is old way of making browser drive

        String browserType = ConfigurationReader.getProperty("browser");
        WebDriver driver = WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.demoblaze.com/index.html");

        ReviewUtils.getLink(driver,"Laptops");

        ReviewUtils.getLink(driver,"Sony vaio i5");

        ReviewUtils.getLink(driver,"Add to cart");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();


    }

}
