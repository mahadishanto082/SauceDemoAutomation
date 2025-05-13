package com.ostad;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {

    static ExtentReports extentReports;
    static ExtentSparkReporter sparkReporter;

    public static void setup() {
        extentReports = new ExtentReports();
        sparkReporter = new ExtentSparkReporter("ExtentReport.html");
        extentReports.attachReporter(sparkReporter);
    }

  
}
