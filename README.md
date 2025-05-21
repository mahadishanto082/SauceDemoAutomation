# Saucedemo Automation Testing with Java & Selenium

This project demonstrates UI automation testing on the [SauceDemo](https://www.saucedemo.com/) web application using **Java**, **Selenium WebDriver**, and **TestNG**. The tests are designed and structured around three tasks, each implemented in separate test classes.

## 📁 Project Structure
```
src
└── test
└── java
└── com
└── ostad
├── AppTest.java # Task 1
├── secondtest.java # Task 2
├── thirdtest.java # Task 3
├── Ostadtest.java # Sequential run entry point
└── Reporter.java # Extent report setup
```

## ✅ Features

- Login functionality test
- Product add-to-cart and checkout test
- End-to-end scenario with verification
- Test reports using **ExtentReports**
- Ready for **Allure Report** generation (requires configuration)

---

## 🔧 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- ExtentReports
- Allure (optional)

---

2. Build the Project
Make sure you are inside the folder where the pom.xml exists:


mvn clean install
3. Run Individual Tests
Run each task separately using TestNG:


# Task 1


# Task 2
# Task 3

4. Run All Tests Sequentially
To run all tasks in sequence, use the central runner:


📊 Reports
📘 Extent Report
After test execution, a file named ExtentReport.html will be generated in the root directory.

📗 Allure Report (Optional)
If using Allure:


# Generate Allure results
mvn clean test

# Serve the report
allure serve target/allure-results
⚠️ Make sure Allure CLI is installed: Allure CLI Installation Guide

