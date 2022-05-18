package ders4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assertion {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){
//
//        Assert.assertEquals();  // String olan metinler uzerinden yapiyoruz
//        Assert.assertFalse();   //aradigimiz urunun ekranda gozukmemesi gerekiyor
//        Assert.assertTrue();   //aradigimiz urunun ekranda olmasi gerekiyor.
        driver.get("https://google.com");
        String title= driver.getTitle();//Google'un title'ini alacagim
        System.out.println(title);
        //burda'da dogrulamasini yapacagim
        Assert.assertEquals("Google",title);
        System.out.println("Testimiz basarili bir sekilde gecti");
//if (title.contains("Googlee")){
//    System.out.println("Testimiz gecti");
//}else{
//    System.out.println("Testimiz gecmedi");
//}
    }
    @Test
    public static void test2(){
        driver.get("https://YouTube.com");
        String youTubeTitle=driver.getTitle();
        System.out.println("youTubeTitle:"+youTubeTitle);

        boolean iceriyormu=youTubeTitle.contains("YouTube");
        Assert.assertTrue(iceriyormu);
    }
    @Test
    public static void test3(){
        driver.get("http://facebook.com");
        String facebookTitle=driver.getTitle();
        System.out.println("facebookTitle:"+facebookTitle);
        boolean iceriyor_mu=facebookTitle.contains("Facebook");

        Assert.assertFalse(iceriyor_mu);
    }
}
