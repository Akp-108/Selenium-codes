package com.example;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	

public class XpathTest2 {
    public static void main(String[] args) {
        String baseUrl = "https://demo.guru99.com/test/selenium-xpath.html";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ATUL KUMAR PANDEY\\Desktop\\Cloudeq Tranning\\selenium\\selenium project\\guru99\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(
            By.xpath("//*[contain(@name,'btnLogin')]")).click(); 		
        driver.quit();
        String innerText = driver.findElement(
            By.xpath("//*[contain(@name,'btnLogin')]")).getText(); 		
            System.out.println(innerText); 
        driver.quit();
    }
}
