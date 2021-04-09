package com.MethodOverRide;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest implements SeleniumWebDriver{
    public static WebDriver driver;
    @Override
    public void getDriver() {
        System.setProperty("webdriver.chrome.driver","E://muntasir_downloads//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Override
    public void closeDriver() {

        driver.close();
    }

    public static void main(String[] args) {
        ChromeTest obj = new ChromeTest();
        obj.getDriver();
        obj.closeDriver();
    }
}
