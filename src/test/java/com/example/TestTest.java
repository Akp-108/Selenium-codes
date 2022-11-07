package com.example;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.support.ui.Select;
public class TestTest {
    public static void main(String[] args) { 
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ATUL KUMAR PANDEY\\Desktop\\Cloudeq Tranning\\selenium\\selenium project\\guru99\\resources\\drivers\\chromedriver.exe");
            String baseURL = "http://demo.guru99.com/test/newtours/register.php";
            WebDriver driver = new ChromeDriver();
            driver.get(baseURL);
    
            // Select drpCountry = new Select(driver.findElement(By.name("country")));
            Select drpCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
    
            drpCountry.selectByVisibleText("ANTARCTICA");
            // drpCountry.selectByIndex("6");
    
            //Selecting Items in a Multiple SELECT elements
            driver.get("http://jsbin.com/osebed/2");
            Select fruits = new Select(driver.findElement(By.id("fruits")));
            fruits.selectByVisibleText("Banana");
            fruits.selectByIndex(1);
     }
}
