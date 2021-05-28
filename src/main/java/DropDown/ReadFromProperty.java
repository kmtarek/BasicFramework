package DropDown;

import com.Base.TestBase;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperty extends TestBase {


        public static void main(String[] args) throws IOException, InterruptedException {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//or.properties");
            Properties pr = new Properties();
            pr.load(fis);

            //pr.getProperty("email");
            System.out.println(pr.getProperty("email"));
            String password =   pr.getProperty("pw");
            System.out.println(password);
            launchChrome();
            System.out.println(pr.getProperty("website"));
            driver.get(pr.getProperty("web"));
            driver.findElement(By.xpath(pr.getProperty("gmail"))).click();
            Thread.sleep(3000);
            closeBrowser();
        }


    }

