package com.Browser;

import com.Base.TestBase;
import org.omg.Messaging.SyncScopeHelper;

public class TitleVerification extends TestBase {

    public static void main(String[] args) {
        launchChrome();
        driver.get("https://www.ebay.com/");
        String expTitle="Electr, Cars, Fashion, Collectibles & More | eBay";
        String actTitle = driver.getTitle();
        if(expTitle.contains("Fashion")){

            System.out.println("Title Verified and Test Passed");
        }else{
            System.out.println("Title Verified and Test FAILED!!!");
            System.out.println("Actual Title is :"+actTitle);
        }
        loseBrowser();
    }


}
