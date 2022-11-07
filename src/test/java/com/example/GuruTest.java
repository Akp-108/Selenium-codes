package com.example;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GuruTest {



    public static String baseUrl = "http://demo.guru99.com/test/newtours/";

    public static String expectedTitle = "Welcome: Mercury Tours";

    public static String actualTitle = "";

    public static WebDriver driver;



    public static void main(String [] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ATUL KUMAR PANDEY\\Desktop\\Cloudeq Tranning\\selenium\\selenium project\\guru99\\resources\\drivers\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){



            System.out.println("----------------------------------------------");

            System.out.println("Test Passed!");

            System.out.println("----------------------------------------------");

        } else {

            System.out.println("Test Failed");

        }

        // WebElement element = driver.findElement(By.name("userName")) ;
        // WebElement element = driver.findElement(By.xpath("//input[@type='text']")) ;

        // element.clear();

        // element.sendKeys("atul");

        driver.findElement(By.name("userName")).click();

        driver.findElement(By.name("userName")).sendKeys("username");

        driver.findElement(By.name("password")).click();

        driver.findElement(By.name("password")).sendKeys("password");

        driver.findElement(By.name("submit")).click();

        // Thread.sleep(1000);

        // WebElement ele = driver.findElement(By.xpath("//h3"));


        // ele.getText();

        
        // System.out.println("the out put of the codne is : " + ele.getRect());

        
        

        





        // WebElement ele = driver.findElement(By.xpath("//a[@href='/java-tutorial.html' and @xpath='1']")) ;

        // ele.getText();

        // System.out.println("value we fateched from xPath: " + ele.getText());

        // if(ele.getText() == "JAVA")
        // {
        //     System.out.println("JAVA");
        // }
        // else{
        //     System.out.println("Fail");
            
        // }


       

        driver.close();

    }

}