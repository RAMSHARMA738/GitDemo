package com.framework.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtils {
    private static ExtentReports extent;
    private static ExtentTest test;
    
    public static ExtentReports createInstance() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/ExtentReports.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        return extent;
    }

    public static void logTest(String testName) {
        test = extent.createTest(testName);
    }

    public static void flush() {
        extent.flush();
    }
}
