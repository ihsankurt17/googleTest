package ders3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CssSelector {
    WebDriver driver;
    @Test
    public void facebook() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://facebook.com");

//        WebElement guvenlikDuvari=driver.findElement(By.xpath("//*[.='Allow essential and optional cookies']"));
//        guvenlikDuvari.click();
       WebElement guvenlikDuvari=driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
       guvenlikDuvari.click();
       WebElement email=driver.findElement(By.cssSelector("input#email"));
       email.sendKeys("emre@gmail.com");
       WebElement passwordF=driver.findElement(By.cssSelector("input[type='password']"));
       passwordF.sendKeys("3427sjsjdskl"+ Keys.ENTER);
    }
}
