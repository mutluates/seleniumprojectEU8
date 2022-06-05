package com.cydeo.utilities;

import com.cydeo.tests.base.TestBase;
import org.testng.annotations.Test;

public class TestCaseAdidas extends TestBase {



    @Test
    public void Test(){

        driver.get("https://www.demoblaze.com/index.html");

        double price = ReviewUtils.addProduct(driver,"Laptops","Sony vaio i5");
        System.out.println("price = " + price);
    }





}
