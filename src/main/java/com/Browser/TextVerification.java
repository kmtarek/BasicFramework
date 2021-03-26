package com.Browser;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextVerification extends TestBase {

    public static void main(String[] args) {
        launchChrome();
        driver.get("https://www.ebay.com/");
        WebElement findTxt = driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a"));
        String actText = findTxt.getText();
        //String actTxt = "A World of Vehicles";
        if(actText.contains("Daily Deals")){

            System.out.println("Text is verified and Test is PASSED !");
        }else{

            System.out.println("Text is verified and Test is FAILED !");
        }
        loseBrowser();
    }
}
