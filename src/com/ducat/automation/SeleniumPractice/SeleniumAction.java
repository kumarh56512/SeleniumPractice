package com.ducat.automation.SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAction {
    static WebDriver driver;
    static String appURL = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get(appURL);

        driver.findElement(By.id("name")).sendKeys("Sita Chaudhary");
        driver.findElement(By.id("email")).sendKeys("nituc56512@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("989898989");
        driver.findElement(By.id("dob")).sendKeys("08/08/1997");
        driver.findElement(By.id("subjects")).sendKeys("Working Professional");
        driver.findElement(By.id("picture")).sendKeys(" Mamura Sector 66");



    }
}