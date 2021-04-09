package com.MethodOverRide;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest implements SeleniumWebDriver{

    public static WebDriver driver;

    @Override
    public void getDriver() {
        System.setProperty("webdriver.gecko.driver","E://muntasir_downloads//geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Override
    public void closeDriver() {
    driver.close();
    }

    public static void main(String[] args) {
        FirefoxTest obj = new FirefoxTest();
        obj.getDriver();
        obj.closeDriver();
    }

}
