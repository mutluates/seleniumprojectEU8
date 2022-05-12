package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("----> BeforeClass is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> BeforeMethod is running");
    }


    @Test (priority = 1)  // you can change the order of compiling by the priority
    public void test1(){
        System.out.println("Test 1 is running...");

        // ASSERT EQUALS : compare 2 of the same things
        String actual   = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);

    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running...");

        // AsserTrue
        String actual   = "apple";
        String expected = "apple2";

        Assert.assertTrue(actual.equals(expected));
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> AfterMethod is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("---> AfterClass is running!");
    }

}
