package com.Listeners;

import com.Base.TestBase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ListenerTest extends TestBase {



    @BeforeMethod
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//resources//chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Test
    public  static void loginTest(){
        driver.get("https://demo.opencart.com/");
    }

    @Test
    public  static void loginFailed(){
        Assert.fail();
    }
    @AfterMethod
    public static void closeBrowser(){
driver.quit();

    }


}
