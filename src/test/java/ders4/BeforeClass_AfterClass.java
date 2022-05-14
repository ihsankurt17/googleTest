package ders4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClass_AfterClass {
    @BeforeClass
    public  static void setUp(){
        System.out.println("Before class calisti");
        //Gidecegimiz sayfaya gidiyoruz
    }
    @BeforeMethod
    public void testtenOnce(){
        System.out.println("testten once calisti ");
    }
    @Test
    public void test1(){
        System.out.println("test 1 calisti ");
        // testlerimizi calistiriyoruz
    }
    @Test
    public void test2() {
        System.out.println("test 2 calisti ");
        //testlerimizi calistiriyoruz
    }
    @AfterMethod
    public void testtenSonra(){
        System.out.println("testten sonra calisti ");

    }

   public static void tearDown(){
//sayfayi kapatiyoruz
       System.out.println("After class calisti");

   }

}
