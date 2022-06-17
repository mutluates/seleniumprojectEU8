package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_DoubleClick {

    @Test
    public void t1_double_click_test(){

        // TC #1: Double Click Test
        // 1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclck2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().switchTo().frame("iframeResult");

        // 2. Switch to iframe.
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        Actions actions = new Actions(Driver.getDriver());

        // 3. Double click on the text “Double-click me to change my text color.”
        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();

        // 4. Assert: Text’s “style” attribute value contains “red”.

        String actualAttributeValue = doubleClickPage.textToDoubleClick.getAttribute("style");
        String expectedInStyleAttribute = "red";

        Assert.assertTrue(actualAttributeValue.contains(expectedInStyleAttribute));


    }


}
