package com.ducat.automation.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SeleniumSelector {

    static String appURL = "https://automationexercise.com/";
    WebDriver driver;

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get(appURL);

         List<WebElement> elb = driver.findElements(By.cssSelector("div[class='shop-menu pull-right']>ul li>a"));

         for(WebElement e:elb)
         {
             if(e.getText().equals("/test_cases"))
             {
                 e.click();
             }

         }

    }
}
