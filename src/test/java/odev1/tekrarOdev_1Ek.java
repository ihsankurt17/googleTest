package odev1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.Kernel;
import java.util.concurrent.TimeUnit;

public class tekrarOdev_1Ek {
    static WebDriver driver;

    @BeforeClass
    public static void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public static void bmethod() {
        driver.get("https://youTube.com");
    }
    @Test
    public static void test1() throws InterruptedException {
        WebElement guvDuvar = driver.findElement(By.xpath("//*[.='Accept all']"));
        guvDuvar.click();
        Thread.sleep(3000);

        WebElement search = driver.findElement(By.cssSelector("input[id='search']"));
        Thread.sleep(6000);
        search.click();
        search.sendKeys("imdat" + Keys.ENTER);
        WebElement imdat = driver.findElement(By.xpath("(//*[.='İmdat'])[6]"));
        imdat.click();
        Thread.sleep(70000);
        WebElement youDuvar2 = driver.findElement(By.xpath("//*[.='No, thanks']"));
        youDuvar2.click();
    }

    @Test
    public static void test2() throws InterruptedException {
        WebElement clear = driver.findElement(By.cssSelector("input[id='search']"));
        Thread.sleep(6000);
        clear.click();
        clear.clear();
        clear.sendKeys("Kervan" + Keys.ENTER);
        WebElement kervan = driver.findElement(By.xpath("//*[.='Krvn']"));
        kervan.click();
        Thread.sleep(25000);
        WebElement views = driver.findElement(By.xpath("(//div[@id='count'])[2]"));
        System.out.println("izlenme1:" + views.getText());
    }

    @Test
    public static void test3() throws InterruptedException {
        WebElement clear2 = driver.findElement(By.cssSelector("input[id='search']"));
        Thread.sleep(6000);
        clear2.click();
        clear2.clear();
        clear2.sendKeys("Makina" + Keys.ENTER);
        WebElement makina = driver.findElement(By.partialLinkText("Makina"));
        makina.click();
        Thread.sleep(15000);
        WebElement viewsMakina = driver.findElement(By.xpath("(//div[@id='count'])[2]"));
        System.out.println("izlenme2:" + viewsMakina.getText());
    }
    @AfterClass
    public static void afterClass(){
        driver.quit();
    }
}


