package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_locators_getText {

    public static void main(String[] args) {

        //  TC #1: NextBaseCRM, locators and getText() practice
        //   1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //   2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com/");

        //   3- Enter incorrect username: “incorrect”
        //   4- Enter incorrect password: “incorrect”
        //   5- Click to login button.
        //   6- Verify error message text is as expected:
        //      Expected: Incorrect login or password

    }
}
