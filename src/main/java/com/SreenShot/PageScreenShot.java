package com.SreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PageScreenShot {
    public static void main(String[] args) throws IOException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "E://muntasir_downloads//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        //Take Screen Shot

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Save Sreen Shot in png or jpg format

        FileUtils.copyFile(srcFile, new File("E://ScreenShots//screenShots.png"), true);

        driver.close();
    }



}
