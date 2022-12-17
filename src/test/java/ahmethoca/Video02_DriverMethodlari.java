package ahmethoca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video02_DriverMethodlari {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //1-driver.get(url)--> yazdigimiz url'e gider
        driver.get("https://amazon.com");

        //- driver.getTitle(); Icinde olunan sayfanin basligini String olarak getirir
        System.out.println("sayfa title="+driver.getTitle());

        //- driver.getCurrentUrl(); Icinde olunan sayfanin Url’ini String olarak getirir.
        System.out.println(driver.getCurrentUrl());//https://amazon.com

        //driver.getPageSource(); Icinde olunan sayfanin kaynak kodlarini String olarak getirir
        System.out.println("================================================================");
        System.out.println(driver.getPageSource());//arka planda calisan sayfa kodlarini yazdirir.
        System.out.println("=================================================================");

        // driver.getWindowHandle(); Icinde olunan sayfa ve/veya tab’larin handle degerlerini getirir.
        System.out.println(driver.getWindowHandle());//CDwindow-0D9CCBFF563AAB2B1648001C7D39023E

        //- driver.getWindowHandles(); Icinde olunan sayfa ve/veya tab’larin handle degerlerini getirir

    }
}
