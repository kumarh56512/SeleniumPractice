package com.ducat.automation.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCssSelector {

    WebDriver driver;
    static String appURL = "https://omayo.blogspot.com/";

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get(appURL);

        WebElement e= driver.findElement(By.cssSelector("div[class='widget-content']>form>input[name='userid']"));
        e.sendKeys("dimagkharab");

    }

}
