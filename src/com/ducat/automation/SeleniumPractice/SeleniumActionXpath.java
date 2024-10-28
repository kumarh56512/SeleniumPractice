package com.ducat.automation.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActionXpath {


    static String appURL = "https://omayo.blogspot.com/";
    WebDriver driver;

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get(appURL);

        WebElement e = driver.findElement(By.linkText("Page One"));
        e.click();
    }
}
