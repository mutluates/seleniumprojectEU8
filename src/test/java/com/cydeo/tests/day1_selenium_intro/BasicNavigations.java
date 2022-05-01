package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1-Setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium Web Driver
        WebDriver driver = new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //3-Go to "https://www.tesla.com "
        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);


        // use navigate().to():
        driver.navigate().to("https://www.google.com");

        currentTitle = driver.getTitle();

        // get the title of the page
        // System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // this will close
        driver.close();


    }
}
