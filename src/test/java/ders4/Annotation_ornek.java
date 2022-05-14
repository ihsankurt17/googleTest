package ders4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Annotation_ornek {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @BeforeMethod
    public void beforeMethode(){
        driver.get("https://google.com");
    }
    @Test
    public void test1() throws InterruptedException {
        WebElement Iagree=driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(3000);
        Iagree.click();
        WebElement arama=driver.findElement(By.name("q"));
        arama.sendKeys("Elma"+ Keys.ENTER);
    }
    @Test
    public void test2(){
        WebElement arama=driver.findElement(By.name("q"));
        arama.sendKeys("city bike"+ Keys.ENTER);

    }
    @Test
    public void test3(){
        WebElement arama=driver.findElement(By.name("q"));
        arama.sendKeys("kulaklik"+ Keys.ENTER);

    }
    @AfterMethod
    public void AfterMethod(){
        WebElement sonuc=driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }

}
