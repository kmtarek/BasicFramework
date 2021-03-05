package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    static WebDriver driver ;

    public static void main(String[] args) {
        launchChrome();
        launchFirefox();
    }

    public static void  launchChrome(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
          driver=new ChromeDriver();
    }
   public static void launchFirefox(){
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//main//resources//geckodriver.exe");
        driver=new FirefoxDriver();
   }
}
