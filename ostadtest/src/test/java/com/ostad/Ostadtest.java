package com.ostad;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ostadtest extends Extent {

    public Ostadtest() {
        setup(); // initializes extentreports
    }
@Test
public void testMethod() {

    ExtentTest test = extentReports.createTest("OstadFinalTest");
    test.info("This is a test");
    WebDriverManager.chromedriver().setup();
    test.info("WebDriverManager setup complete");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    test.info("Navigated to saucedemo.com");
    
    String title = driver.getTitle();
    test.info("Page title is: Loginpage " + title);
    driver.manage().window().maximize();
    driver.findElement(By.id("user-name")).sendKeys(" locked_out_user");
   
    driver.findElement(By.id("password")).sendKeys("");
    driver.findElement(By.id("login-button")).click();
try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.quit();
    }
}
