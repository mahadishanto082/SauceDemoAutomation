package com.ostad;

import io.qameta.allure.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Epic("Automation")
@Feature("Login Functionality")
@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class Ostadtest {

    WebDriver driver;

    @Test(description = "Login with locked user")
    @Severity(SeverityLevel.CRITICAL)
    @Story("User should see error when login is locked")
    @Description("Login test using locked_out_user on saucedemo.com")
    public void testLogin() {
        setupDriver();
        openLoginPage();
        enterUsername("locked_out_user");
        enterPassword("");
        clickLoginButton();
        waitForSeconds(1);
        closeBrowser();
    }

    @Step("Set up ChromeDriver")
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Step("Navigate to saucedemo login page")
    public void openLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @Step("Enter username: {0}")
    public void enterUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @Step("Enter password: {0}")
    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Step("Click on login button")
    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Step("Wait for {0} second(s)")
    public void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Close the browser")
    public void closeBrowser() {
        driver.quit();
    }
}
