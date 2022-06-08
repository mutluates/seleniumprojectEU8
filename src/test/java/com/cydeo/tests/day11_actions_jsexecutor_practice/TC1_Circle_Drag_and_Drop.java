package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_Circle_Drag_and_Drop {

    @Test
    public void drag_and_drop(){

        //go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        // Drag and drop the small circle to bigger circle
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(smallCircle).pause(2000).moveToElement(bigCircle).pause(2000).release(bigCircle).perform();



        // Assert : -Text in big circle change to : "You did great!"

        WebElement bigCircleText = Driver.getDriver().findElement(By.xpath("//div[text()='You did great!']"));

        Assert.assertTrue(bigCircleText.isDisplayed());


        Driver.closeDriver();

    }

}
