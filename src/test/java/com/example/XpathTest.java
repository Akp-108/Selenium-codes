package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;	
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {

    public static String baseUrl = "https://atul-pandey-portfolio.netlify.app/";
    public static WebDriver driver;

    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ATUL KUMAR PANDEY\\Desktop\\Cloudeq Tranning\\selenium\\selenium project\\guru99\\resources\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(baseUrl);


        String basicXpath =  driver.findElement(By.xpath("//h1[@class='name']")).getText();

        String containsXpath =  driver.findElement(By.xpath("//*[contains(text(),'Design and code by  ATUL KUMAR PANDEY')]")).getText();
        
        String orXpath =  driver.findElement(By.xpath("//*[@href='mailto' or @class='mailLink']")).getText();
        
        String andXpath =  driver.findElement(By.xpath("//*[@href='mailto' or @class='mailLink']")).getText();
        
        String startsWithXpath =  driver.findElement(By.xpath("//h1[starts-with(@class,'project')]")).getText();
        
        String textXpath =  driver.findElement(By.xpath("//h1[text()='FULLSTACK DEVELOPER']")).getText();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0,600)");
        js.executeScript("alert('Welcome');");


        System.out.println("----------------------------------------------");
        System.out.println(basicXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(containsXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(orXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(andXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(startsWithXpath);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println(textXpath);
        System.out.println("----------------------------------------------");
       
    }
}

