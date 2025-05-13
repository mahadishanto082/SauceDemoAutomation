package com.ostad;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondtest  extends Extent {

    public secondtest() {
        setup(); // initializes extentreports
    }
@Test
public void testMethod() {
    ExtentTest test = extentReports.createTest("OstadFinalTest");
    test.info("This is a test");
    WebDriverManager.chromedriver().setup();
    test.info("WebDriverManager setup complete");
    ChromeOptions options = new ChromeOptions();

    options.addArguments("--incognito");// make it to incognito mode
WebDriver driver = new ChromeDriver(options);
   


    
    driver.get("https://www.saucedemo.com/");
    test.info("Navigated to saucedemo.com");
    String title = driver.getTitle();
    test.info("Page title is: Loginpage " + title);
    driver.manage().window().maximize();
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
   
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    
    
    driver.findElement(By.id("react-burger-menu-btn")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        
        e.printStackTrace();
    } // 1-second wait after menu opens
driver.findElement(By.id("reset_sidebar_link")).click();
driver.findElement (By.id("add-to-cart-sauce-labs-backpack")).click();
driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    
    e.printStackTrace();
} // 1-second wait after menu opens
driver.findElement(By.className("shopping_cart_link")).click();
try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    
    e.printStackTrace();
} // 1-second wait after menu opens
driver.findElement(By.id("checkout")).click();
try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} // 1-second wait after menu opens
driver.findElement(By.id("first-name")).sendKeys("Ostad");
driver.findElement(By.id("last-name")).sendKeys("Test");
driver.findElement(By.id("postal-code")).sendKeys("12345");
driver.findElement(By.id("continue")).click();
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} // 1-second wait after menu opens
driver.findElement(By.id("finish")).click();
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} // 1-second wait after menu opens
driver.findElement(By.id("back-to-products")).click();
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} // 1-second wait after menu opens
driver.findElement(By.id("react-burger-menu-btn")).click();
    try {
    Thread.sleep(1000);
        } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    } // 1-second wait after menu opens

driver.findElement(By.id("reset_sidebar_link")).click();
driver.findElement(By.id("logout_sidebar_link")).click();
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    driver.quit();

  
        }
    }
}

