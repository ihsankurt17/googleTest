package ders2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tag_Name {
    static WebDriver driver;

    @Test

    public void tagName() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");
        WebElement Iagree=driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(3000);
        Iagree.click();
        WebElement yazi=driver.findElement(By.tagName("a"));
        System.out.println("en bastaki a tagname'e sahip yazi:"+yazi.getText());

        List<WebElement> listem=driver.findElements(By.tagName("a"));
        for (WebElement w:listem){
            System.out.println("butun tagnames:"+w.getText());

        }
        System.out.println("h:"+listem.toString());  //=>boyle yapinca sadece referans alabiliyoruz

}}
