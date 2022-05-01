package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc01_YahooTitleVerification {

    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification

        //do setup browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // make our page fullscreen
        driver.manage().window().maximize();

        //2. Go to http://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. Verify title:

        //Expected : Yahoo
        String expectedResult ="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedResult)){

            System.out.println(" Title is as expected. Verification PASSED! " );
        }else {
            System.out.println("Title is NOT as expected. Verification FAİLED!");
        }
        driver.close();

    }
}
