package com.ostad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    

    public class test extends Extent {
     @Test
    public void testMethod() {
        ExtentTest test = extentReports.createTest("OstadFinalTest");
        test.info("This is a test");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }   
}
}
