package com.ducat.automation.beginor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURLDemo {
    static WebDriver driver;


    public static void main(String[] args){
       driver = new ChromeDriver();
       launchAppURL();
       currentURLinfo();
       pageTitleInfo();


    }
    static void launchAppURL(){
        String appURL="https://twitter.com/";
        driver.get(appURL);
    }
    static String currentURLinfo(){
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        return currentURL;
    }
    static String pageTitleInfo(){
        String pageInfo = driver.getTitle();
        System.out.println(pageInfo);
        return pageInfo;
    }
}
