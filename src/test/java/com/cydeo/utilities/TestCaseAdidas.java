package com.cydeo.utilities;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseAdidas extends TestBase {



    @Test
    public void Test(){
        double expectedPrice =0;
        driver.get("https://www.demoblaze.com/index.html");

        expectedPrice += ReviewUtils.addProduct(driver,"Laptops","Sony vaio i5");

        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();

        expectedPrice += ReviewUtils.addProduct(driver,"Phones","Samsung galaxy s6");

        ReviewUtils.getLink(driver,"Cart");
        ReviewUtils.staticWait(3);

        // First get Cart price than click on place order
        double cartPrice = Double.parseDouble(driver.findElement(By.id("totalp")).getText());
        System.out.println("cartPrice = " + cartPrice);


        //click on Place order : // button[.='Place Order']
        System.out.println("expectedPrice = " + expectedPrice);

        driver.findElement(By.xpath("// button[.='Place Order']")).click();
        ReviewUtils.staticWait(3);

        ReviewUtils.fillForm(driver);

        String confirmation = driver.findElement(By.xpath("//p[@class='lead text-muted ']")).getText();

        String IDtext = driver.findElement(By.xpath("//p[@class='lead text-muted ']/br")).getText();
        System.out.println("IDtext = " + IDtext);
        System.out.println("confirmation = " + confirmation);

        /*
        Id: 7687748
        Amount: 1150 USD
        Card Number: 3689-577912-0618
        Name: Willie
        Date: 5/5/2022
        */

        String ID = confirmation.split("\n")[0];
        double actualPrice = Double.parseDouble(confirmation.split("\n")[1].split(" ")[1]);

        System.out.println("ID = " + ID);
        System.out.println("actualPrice = " + actualPrice);


    }





}
