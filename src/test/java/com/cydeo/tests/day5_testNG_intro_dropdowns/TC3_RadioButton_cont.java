package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC3_RadioButton_cont {

    public static void main(String[] args) {

        // TC #2: Radiobutton handling
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        // 3. Locate name='sports' radio buttons and store them in a list of Web Element

        clickAndVerifyRadioButton(driver, "sport", "hockey");


    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> RadioButtons = driver.findElements(By.name(nameAttribute));

        // 4. Loop through the list of WebElement and select matching result "hockey"
        for (WebElement each : RadioButtons) {

            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId);

            if (eachId.equals(idValue)) {
                each.click();
                System.out.println(eachId + " is selected : " + each.isSelected());
                break;
            }

        }

    }
}
