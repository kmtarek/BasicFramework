package com.Browser;

import com.Base.TestBase;

public class UrlVerification extends TestBase {

    public static void main(String[] args) {
        launchFirefox();
        driver.get("https://www.ebay.com/");
        String expURL="https://www.ebay.com/";
        String actURL=driver.getCurrentUrl();
        if(expURL.equals(actURL)){
            System.out.println("URL Verified and Test is PASSED !");
        }else{

            System.out.println("URL Verified and Test is FAILED !");
        }

        loseBrowser();
    }
}
