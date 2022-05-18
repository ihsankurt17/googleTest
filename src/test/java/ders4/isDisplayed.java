package ders4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class isDisplayed {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://google.com");
        WebElement guvDuvar=driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(3000);
        guvDuvar.click();
        WebElement logo=driver.findElement(By.className("lnXdpd"));

        boolean goruyormu =logo.isDisplayed();
        Assert.assertTrue(goruyormu);

    }
}
