package odev1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TekrarOdev_1 {
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @BeforeMethod
    public static void beforeMet() {
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

    }

    @Test
    public static void test1() throws InterruptedException {
        WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));
        arama.click();
        arama.sendKeys("computer");
        arama.submit();
        Thread.sleep(3000);
        driver.navigate().to("https://facebook.com");
        WebElement guvDuvari = driver.findElement(By.xpath("//*[.='Allow essential and optional cookies']"));
        guvDuvari.click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement clear = driver.findElement(By.id("twotabsearchtextbox"));
        clear.click();
        clear.clear();
        WebElement newArama = driver.findElement(By.id("twotabsearchtextbox"));
        newArama.click();
        newArama.sendKeys("s22" + Keys.ENTER);
        Thread.sleep(2000);
//        WebElement result=driver.findElement(By.xpath("//*[.='1-16 of 236 results for']"));
//        System.out.println("sonuc1:"+result.getText());
        WebElement sonuc2=driver.findElement(By.className("sg-col-inner"));
        System.out.println("sonuc2"+sonuc2.getText());
    }
    @AfterClass
    public static void afterClass(){
        driver.close();
    }

}
