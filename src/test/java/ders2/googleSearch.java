package ders2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class googleSearch {
    static WebDriver driver;

    @Test

    public void googleSearch() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");
        WebElement Iagree=driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(3000);
        Iagree.click();

        WebElement q=driver.findElement(By.name("q"));
       q.sendKeys("city bike");//+ Keys.ENTER);
        q.submit();

        WebElement sonuc=driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());

        WebElement shopping =driver.findElement(By.partialLinkText("Shopping"));
        shopping.click();
        }


}
