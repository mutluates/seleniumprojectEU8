package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_cssSelector_getAttribute {

    public static void main(String[] args) {

        // TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //  1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //  2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //  3- Verify “Log in” button text is as expected:
        //   Expected: Log In
        // WebElement signInButton = driver.findElement(By.className("login-btn"));  this is the first way...

        // locating the same web element using different attribute values.
                        // tagName[attribute='value']
                        // input[attribute='value']
        // located using class  attribute                                           this is the second way...
       // WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        // located using type attribute
        WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        String expectedButtonText = "Log In";

        // Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification PASSED!");
        }else {
            System.out.println("Log In button text verification FAİLED!!!");
        }

    }
}
