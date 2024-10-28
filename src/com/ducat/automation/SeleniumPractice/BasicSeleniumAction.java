package com.ducat.automation.SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumAction {
    static WebDriver driver;
    static String appURL = "https://omayo.blogspot.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get(appURL);

        WebElement e = driver.findElement(By.id("ta1"));
        e.sendKeys("Hello selenium");
        driver.findElement(By.name("userid")).sendKeys("Harendra Pal");
        driver.findElement(By.name("textboxn")).sendKeys("Harendra@56512@gmail.com");
        driver.findElement(By.name("q")).sendKeys("hello world ");
        WebElement z =driver.findElement(By.cssSelector("input[value='Search']"));
        z.click();

        // here click working fine

        Thread.sleep(5000);
        driver.quit();


    }

}
