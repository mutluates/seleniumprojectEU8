package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_2 {

    public static void main(String[] args) {

        //   TC #2: Zero Bank header verification
        //    1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //    2. Go to http://zero.webappsecurity.com/login.html
        driver.navigate().to("http://zero.webappsecurity.com/login.htm");

        //    3. Verify header text
        //       Expected: “Log in to ZeroBank”

    }
}
