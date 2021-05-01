package com.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//or.properties");
        Properties pr = new Properties();
        pr.load(fis);

        //pr.getProperty("email");
        System.out.println(pr.getProperty("email"));

      String password =   pr.getProperty("pw");
        System.out.println(password);
    }


}
