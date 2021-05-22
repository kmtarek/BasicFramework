package com.SreenShot;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PDFgenerate {
    public static void main(String[] args) throws IOException, DocumentException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src/main//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/n/all-categories");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Take Screenshot and store it in byte[] array format
        byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

        Document document = new Document();

        String output = "E://ScreenShots//MyPDF1.pdf";

        FileOutputStream fos = new FileOutputStream(output);

        //instantiate the pdf writer
        PdfWriter writer = PdfWriter.getInstance(document, fos);

        // open the pdf for writting
        writer.open();
        document.open();

        // process content into add image
        Image img = Image.getInstance(input);

        // set the size of the image
        img.scaleToFit(PageSize.A4.getWidth()/2,PageSize.A4.getHeight()/2);

        //add image to PDF
        document.add(img);
        document.add(new Paragraph(" "));

        // close the files and save to local drive
        document.close();
        writer.close();

        driver.close();
    }
}
