package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_cssSelector_getText {

    public static void main(String[] args) {

        // TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //   1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.manage().window().maximize();

        //   2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");

        //   3- Verify “Reset password” button text is as expected:
        //      Expected: Reset password
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        String expectedResetPasswordButtonText = "Reset password";

        String actualResetPasswordButtonText = resetPasswordButton.getText();

        System.out.println("actualResetPasswordButton = " + actualResetPasswordButtonText);

        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Reset Button verification Passed!");
        }else {
            System.out.println("Reset Button verification Failed!");
        }


    }
}
