package com.ducat.automation.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {


    static String configFilepath = "C:\\Users\\poc56\\IdeaProjects\\SeleniumPractice\\src\\com\\ducat\\automation\\intermediate\\config.properties";

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(new File(configFilepath));
        Properties pr = new Properties();
        pr.load(fis);

        String applicationURL = pr.getProperty("appURL");
        String browserName = pr.getProperty("browser");
        String envDetails = pr.getProperty("Env");
        String applicationUserName = pr.getProperty("appUserName");
        String applicationPassword = pr.getProperty("appPassword");

        System.out.println(applicationURL);
        System.out.println(browserName);
        System.out.println(envDetails);
        System.out.println(applicationUserName);
        System.out.println(applicationPassword);

    }
}

