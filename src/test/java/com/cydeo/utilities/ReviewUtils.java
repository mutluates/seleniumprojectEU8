package com.cydeo.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
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

             driver.findElement(By.partialLinkText(link)).click();
             staticWait(1);
    }

    public static double addProduct(WebDriver driver,String category ,String product){

        getLink(driver,category);  // click on category
        getLink(driver,product);   // click on category
        //Let's get product's price
        String priceText = driver.findElement(By.tagName("h3")).getText();
        double price = Double.parseDouble(priceText.substring(1,4));

        getLink(driver,"Add to cart");
        Alert alert = driver.switchTo().alert();
        alert.accept();

        return price;
    }

    public static void fillForm(WebDriver driver){

        Faker faker = new Faker();
        driver.findElement(By.id("name")).sendKeys(faker.name().firstName());
        driver.findElement(By.id("country")).sendKeys(faker.country().name());
        driver.findElement(By.id("city")).sendKeys(faker.address().city());
        driver.findElement(By.id("card")).sendKeys(faker.finance().creditCard());
        driver.findElement(By.id("month")).sendKeys(""+faker.number().numberBetween(1,12));
        driver.findElement(By.id("year")).sendKeys(""+faker.number().numberBetween(2022,2032));
        driver.findElement(By.xpath("//button[.='Purchase']")).click();
        staticWait(2);
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
