package com.SreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ElementSrnShotTwo {
    public static void main(String[] args) throws IOException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main/resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        //Take Screen Shot

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // take element
        WebElement elem = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]"));
        Point point = elem.getLocation();
        int Xcoordinate = point.getX();
        int Ycoordinate = point.getY();

        int imageWidth = elem.getSize().getWidth();
        int imageHeight = elem.getSize().getHeight();

        BufferedImage img = ImageIO.read(srcFile);

        BufferedImage FinalImage = img.getSubimage(Xcoordinate,Ycoordinate, imageWidth, imageHeight);

        ImageIO.write(FinalImage, "png", srcFile);

        // Save Sreen Shot in png or jpg format

        FileUtils.copyFile(srcFile, new File("E://ScreenShots//LOGOScreenShots.png"), true);

        driver.close();
    }
    }



