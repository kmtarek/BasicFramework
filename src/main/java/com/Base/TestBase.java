package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        launchChrome();
        loseBrowser();

    }

    public static void launchChrome() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//resources//chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void launchFirefox() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//main//resources//geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public static void loseBrowser() {
        driver.quit();
    }

    public static WebElement getElementByXpath(String locator) {

       return driver.findElement(By.xpath(locator));

    }

    public static WebElement getElementByID(String locator) {

        return driver.findElement(By.id(locator));

    }
    public static WebElement getElementByName(String locator) {

        return driver.findElement(By.name(locator));

    }

    public static WebElement getElementByCSS(String locator) {

        return driver.findElement(By.cssSelector(locator));

    }

    }

