package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_LibraryLoginPage {

    public static void main(String[] args) {

        // TC #4: Library verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to http://library2.cybertekschool.com/login.html
        driver.navigate().to("http://library2.cybertekschool.com/login.html");

        // 3. Enter username: “incorrect@email.com”

        // 4. Enter password: “incorrect password”
        // 5. Click to Sign in button
        // 6. Verify: visually “Sorry, Wrong Email or Password” displayed


    }
}
