package ders2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class className {
    static WebDriver driver;

    @Test

    public void driverTanimlama() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://gcreddy.com/project/admin/login.php");

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("gcreddy");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Temp@2020");
        WebElement login=driver.findElement(By.id("tdb1"));
        login.click();

        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        String url=driver.getCurrentUrl();
        System.out.println(url);

        if (pageTitle.contains("osCommerce Online Merchant Administration Tool")){
            System.out.println("dogru sayfadasiniz");
        }
        else {
            System.out.println("yanlis sayfadasiniz,tekrar deneyiniz");
        }
        System.out.println("==================================================>");
        if (pageTitle.contains("hello")){
            System.out.println("dogru sayfadasiniz");
        }
        else {
            System.out.println("yanlis sayfadasiniz,tekrar deneyiniz");

            WebElement administration=driver.findElement(By.className("headerLink"));
        }
    }
}
