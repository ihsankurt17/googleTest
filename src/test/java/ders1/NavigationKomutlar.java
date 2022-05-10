package ders1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationKomutlar {
    static WebDriverManager driver;
    @Test
    public void driver_Tanimlama() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        //1-get(); herhangi bir sayfaya gitmek icin kullaniyoruz.
        driver.get("https://google.com");
        Thread.sleep(3000);

        //2-navigate().to() ==> bulundugumuz sayfadan baska bir sayfaya gitmemizi saglar.
        driver.navigate().to("https://amazon.com");

        //3- navigate().back(); komutu geldigimiz sayfaya geri donmemizi saglar
        driver.navigate().back();

        //4- navigate().forward() ileri gitmemizi saglar ama o sayfayi once ziyaret esip geri gitmis olmaliyiz
        driver.navigate().forward();
        Thread.sleep(3000);
        //5- navigate().refresh() calistigimiz sayfayi guncellemeye (yenilemeye) yarar
        driver.navigate().refresh();
        Thread.sleep(3000);
        //driver.close();
        driver.quit();
        driver.quit();
}}
