package com.ducat.automation.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClickAction {

    static WebDriver driver;
    static String appURL ="https://omayo.blogspot.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get(appURL);



        WebElement z3 = driver.findElement(By.cssSelector("input[type='text']"));
        z3.sendKeys("kumarH");

        WebElement z2 = driver.findElement(By.cssSelector("input[type='password']"));
        z2.sendKeys("Ku56512");

        WebElement z = driver.findElement(By.name("q"));
        z.sendKeys("click on search boton");

        WebElement z1 = driver.findElement(By.cssSelector("input[type='submit']"));
        z1.click();

        // click issue
        //Element <input class="gsc-search-button" type="submit"> is not clickable at point (1259,576) because another
        // element <html class="v2">

        Thread.sleep(5000);
        driver.quit();






    }
}
