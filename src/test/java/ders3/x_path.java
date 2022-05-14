package ders3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class x_path {
    WebDriver driver;
    @Test
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://gcreddy.com/project/admin/login.php");
        WebElement userNam=driver.findElement(By.xpath("//input[@type='text']"));
        userNam.click();
        userNam.sendKeys("gcreddy");
        WebElement pasword=driver.findElement(By.xpath("//input[@type='password']"));
        pasword.click();
        pasword.sendKeys("Temp@2020");

        WebElement log=driver.findElement(By.xpath("//span[@class='ui-button-text']"));
        log.click();

    }
}
