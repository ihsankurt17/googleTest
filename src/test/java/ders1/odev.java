package ders1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class odev {
    static WebDriverManager driver;
    @Test
    public void driver_Tanimlama() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        driver.get("https://google.com");

        driver.manage().window().maximize();
        driver.navigate().to("https://youTube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();

    }}
