package ders1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Title_Url_alma {

    static WebDriverManager driver;
    @Test
    public void driver_Tanimlama() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        driver.get("https://google.com");
        String titleGoogle=driver.getTitle();
        System.out.println("GoogleTitle => "+titleGoogle);

        driver.navigate().to("https://amazon.com");
        String titleAmazon=driver.getTitle();
        System.out.println("Amazon Title => "+titleAmazon);
        String urlAmazon=driver.getCurrentUrl();
        System.out.println("urlAmazon=> "+urlAmazon);

        if (urlAmazon.contains("Car")) {
            System.out.println("var:" + urlAmazon);
        }
        else {
            System.out.println("yok:"+urlAmazon);
        }

        System.out.println("===========================================>");

        if (urlAmazon.contains("amazon")) {
            System.out.println("var:" + urlAmazon);
        }
        else {
            System.out.println("yok:"+urlAmazon);
        }

}}
