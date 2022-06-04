package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ReviewUtils {

    public static void staticWait(int second){

        try {
            Thread.sleep(second* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // will be used in demonlaze application, to navigate to different links at the page
    //wiil click on different elements/links at the page

    public static void getLink(WebDriver driver, String link){

             driver.findElement(By.linkText(link)).click();
             staticWait(1);
    }

    public static void windowHandle(WebDriver driver, String pickTitle){

        Set<String> windowsHandles = driver.getWindowHandles();

        for (String eachWindow : windowsHandles) {

            driver.switchTo().window(eachWindow);

            if (driver.getTitle().equals(pickTitle)){
                break;
            }
        }
    }



}
