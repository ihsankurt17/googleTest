package ders4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Odev4Ders {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public static void before(){
        driver.get("http:bestbuy.com");
    }
    @Test
    public void test1(){
String title=driver.getTitle();
        System.out.println("title:"+title);
        boolean iceriyorMu=title.contains("Best");
        Assert.assertTrue(iceriyorMu);

    }
    @Test
    public  static void test2(){
        WebElement logo=driver.findElement(By.className("logo"));
        boolean goruyormu =logo.isDisplayed();
        Assert.assertTrue(goruyormu);


    }
    @Test
    public static void test3(){
     WebElement link=driver.findElement(By.partialLinkText("Mexico"));
     boolean iceriyormu=link.isDisplayed();
     Assert.assertTrue(iceriyormu);



    }
    @AfterMethod
    public static void after(){
        driver.close();
    }

}
