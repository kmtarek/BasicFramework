package com.Navigation;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class navigationTest extends TestBase {

    public static void main(String[] args) throws InterruptedException {
        launchChrome();
        driver.get("https://demo.opencart.com/");
        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
        myAccount.click();
        WebElement rgr = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
        rgr.click();
        //WebElement fname = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
       WebElement fname = getElementByName("firstname");
        fname.sendKeys("tarek");
        Thread.sleep(3000);
        //WebElement lname = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        WebElement lname = getElementByXpath("//*[@id=\"input-lastname\"]");
        lname.sendKeys("khan");
        Thread.sleep(3000);

        WebElement email = getElementByID("input-email");
        email.sendKeys("tarek@gmail.com");
        Thread.sleep(3000);
        WebElement phone = getElementByCSS("#input-telephone");
        phone.sendKeys("01713");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();

        String pageSource = driver.getPageSource();

        boolean actfname = pageSource.contains("tarek");
        //String actfname = fname.get().
        boolean actlname = pageSource.contains("khan");
        //String actlname = lname.getAttribute("value");
        System.out.println(actfname +" "+actlname);

        if(actfname==true && actlname==true){

            System.out.println("Text Exist and Test is PASSED");

        }else{
            System.out.println("Text doesn't Exist and Test is FAILED");
        }

        loseBrowser();


    }

}
