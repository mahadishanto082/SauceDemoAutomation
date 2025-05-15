package com.ostad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.testng.AllureTestNg;

@Listeners({AllureTestNg.class})
public class AppTest {

    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setupExtentReport() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    @Test
    public void testMethod() {
        test = extent.createTest("OstadFinalTest");
        test.info("Setting up WebDriver");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Opening Google");
        driver.get("https://www.google.com");

        test.pass("Opened Google successfully");

        driver.quit();
        test.info("Closed browser");
    }

    @AfterClass
    public void tearDownReport() {
        extent.flush();
    }
}
