package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {


    // Method #1 info:
    // • Name: returnOrderDate ()
    // • Return type: String
    // • Arg1: WebDriver driver
    // • Arg2: String costumerName
    // This method should accept a costumerName and return the costumer order date as a String


    public static String returnOrderDate(WebDriver driver, String costumerName) {

        String locator = "//td[.='" + costumerName + "']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }

    // Method #2 info:
    // • Name: orderVerify ()
    // • Return type: void
    // • Arg1: WebDriver driver
    // • Arg2: String costumerName
    // • Arg3: String expectedOrderDate
    // This method should accept above mentioned arguments and internally assert expectedOrderDate matching actualOrderDate.

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderData) {

        String locator = "//td[.='" + customerName + "']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String actualOrderDate = customerDateCell.getText();

        Assert.assertEquals(actualOrderDate,expectedOrderData);
    }

    //C #3: Create a custom method
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/tables
    //3- Write custom method:
    //
    //• Method name: getTableGetEmail()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String tableNum
    //• Arg3: String firstName

    public static void returnTableEmail(WebDriver driver,int tableNumber,String customerName){

        String locator = "//table["+tableNumber+"]//tbody/tr/td[.='"+ customerName +"']/following-sibling::td[1]";

        WebElement emailText = driver.findElement(By.xpath(locator));

        System.out.println(emailText.getText());

    }



}
