package ders2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Id_Name {
    static WebDriver driver;

    @Test

    public void idName() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://gcreddy.com/project/admin/login.php");

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("gcreddy");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Temp@2020");

        WebElement login=driver.findElement(By.id("tdb1"));
        login.click();
    }
}
