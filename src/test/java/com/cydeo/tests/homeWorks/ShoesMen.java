package com.cydeo.tests.homeWorks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShoesMen {


    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //TC #1: Window Handle practice
        // 1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.etsy.com/");

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

        searchButton.sendKeys("shoes");


        Thread.sleep(2000);

        List<WebElement> menShoes  = driver.findElements(By.xpath("//ul/li/div/div"));

        for (WebElement each : menShoes) {

            if (each.getText().trim().equals("shoes men")){
                each.click();
                break;
            }

        }


    }



}
