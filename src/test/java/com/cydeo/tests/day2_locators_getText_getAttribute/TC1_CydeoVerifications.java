package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_CydeoVerifications {

    public static void main(String[] args) {
        // TC #1: Cydeo practice tool verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2. Go to https://practice.cydeo.co
        driver.navigate().to("https://practice.cydeo.com");
        // 3. Verify URL contains
        // Expected: Cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else {
            System.out.println("URL verification FAILED!!!");
        }
        // 4. Verify title:
        //  Expected: Practice

        String expectedTitle ="Practice";
        String actuaTitle = driver.getTitle();

        if (actuaTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAİLED!!!");
        }



    }

}
