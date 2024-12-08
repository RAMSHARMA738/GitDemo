package com.framework.hooks;

import com.framework.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = DriverFactory.getDriver(System.getProperty("browser", "chrome"));
    }

    @After
    public void tearDown(io.cucumber.java.Scenario scenario) {
        if (scenario.isFailed()) {
            // Capture screenshot code
        }
        driver.quit();
    }
}
