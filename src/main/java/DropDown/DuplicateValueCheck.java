package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValueCheck {


        public static WebDriver driver;



        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//resources//chromedriver.exe");
            driver=new ChromeDriver();

          //  driver.get("https://the-internet.herokuapp.com/dropdown");
            driver.get("file:///C:/Users/Asus/Desktop/The%20Internet.html");


            //all options
            WebElement DropDown=driver.findElement(By.id("dropdown"));
            String allOptions=DropDown.getText();
            System.out.println(allOptions);


            //check repeat

            isSelectOptionsRepeating(DropDown);

            Thread.sleep(3000);

            driver.quit();
        }

        public static boolean isSelectOptionsRepeating(WebElement dropdown)
        {
            Select s = new Select(dropdown);
            List<WebElement> list = s.getOptions();
            Set<String> listNames = new HashSet<String>(list.size());
            for (WebElement w : list) {
                listNames.add(w.getText().trim());
            }

            if(list.size()== listNames.size())
            {
                System.out.print("No Repeat");
                return true;
            }
            else {
                System.out.print("Repeat");
            }
            return false;
        }



    }



