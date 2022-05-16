package odev1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GoogleOdev_1 {

    static WebDriver driver;

    @BeforeClass
    public static void setUp()  {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void AfterClass() {
        driver.close();
    }

    @Test
    public static void test1() throws InterruptedException {
        WebElement Iagree = driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(3000);
        Iagree.click();
        WebElement kulaklik = driver.findElement(By.name("q"));
        kulaklik.click();
        kulaklik.sendKeys("Kulaklik" + Keys.ENTER);


    }

    @Test
    public static void test2() {
        WebElement masa = driver.findElement(By.name("q"));
        masa.click();
        masa.sendKeys("masa" + Keys.ENTER);


    }

    @Test
    public static void test3() {
        WebElement sandalye = driver.findElement(By.name("q"));
        sandalye.click();
        sandalye.sendKeys("sandalye");
        sandalye.submit();


    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println("title:" + title);
        String url = driver.getCurrentUrl();
        System.out.println("url:" + url);
        if (title.contains("Google")) {
            System.out.println("dogru yerdesiniz");
        } else {
            System.out.println("yanlis yerdesiniz");
        }
        if (url.contains("https://www.google.com/")) {
            System.out.println("dogru sayfadasiniz");
        } else {
            System.out.println("yanlis sayfadasiniz");
        }

    }

    @AfterMethod
    public void afterMethod() {
        WebElement result = driver.findElement(By.id("result-stats"));
        System.out.println("kulaklik:" + result.getText());
        
        WebElement resultMasa = driver.findElement(By.id("result-stats"));
        System.out.println("masa:" + resultMasa.getText());

        WebElement resultSandalye = driver.findElement(By.id("result-stats"));
        System.out.println("sandalye:" + resultSandalye.getText());
    }
}
