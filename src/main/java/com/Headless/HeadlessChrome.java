package com.Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//resources//chromedriver.exe");
        ChromeOptions obj = new ChromeOptions();
        obj.setHeadless(true);
        WebDriver driver = new ChromeDriver(obj);

        driver.get("https://demo.opencart.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}