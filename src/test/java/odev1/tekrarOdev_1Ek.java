package odev1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.Kernel;
import java.util.concurrent.TimeUnit;

public class tekrarOdev_1Ek {
    static WebDriver driver;
    @BeforeClass
    public static void before(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @BeforeMethod
    public static void bmethod(){
        driver.get("https://YouTube.com");
        driver.manage().window().maximize();
    }
    @Test
    public static void test() throws InterruptedException {
        WebElement guvDuvar=driver.findElement(By.xpath("//*[.='Accept all']"));
        guvDuvar.click();
        Thread.sleep(3000);
        WebElement sarki=driver.findElement(By.id("search-input"));
        Thread.sleep(5000);
        sarki.click();
        Thread.sleep(4000);
        sarki.sendKeys("merhaba"+ Keys.ENTER);
        Thread.sleep(3000);

    }

}
