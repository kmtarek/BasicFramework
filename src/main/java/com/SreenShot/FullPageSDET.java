package com.SreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FullPageSDET {
    public static void main(String[] args) throws IOException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src/main//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/n/all-categories");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("E://ScreenShots//fullpage.png");
        FileUtils.copyFile(src,trg);
        driver.close();
    }
}
