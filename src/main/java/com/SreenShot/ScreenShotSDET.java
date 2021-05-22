package com.SreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotSDET {
    public static void main(String[] args) throws IOException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src/main//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/n/all-categories");

        WebElement pic1 = driver.findElement(By.xpath("//body/main[@id='mainContent']/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]"));

        File src = pic1.getScreenshotAs(OutputType.FILE);
        File trg = new File("E://ScreenShots//pic1.png");
        FileUtils.copyFile(src, trg);

        driver.close();


    }
}
