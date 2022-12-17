package day01_drivermedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMedhodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1)1-driver.get(url)--> yazdigimiz url'e gider
        driver.get("https://www.amazon.com");
        //2)- driver.getTitle(); Icinde olunan sayfanin basligini String olarak getirir
        driver.getTitle();
        System.out.println("Sayfa basligi" + driver.getTitle());//Sayfa basligiAmazon.com. Spend less. Smile more.

        //3) //- driver.getCurrentUrl(); Icinde olunan sayfanin Url’ini String olarak getirir.
        driver.getCurrentUrl();
        System.out.println("Sayfa Url" + driver.getCurrentUrl());//Sayfa Urlhttps://www.amazon.com/

        //4)driver.getPageSource(); Icinde olunan sayfanin kaynak kodlarini String olarak getirir
//        System.out.println("======================================================");
//        System.out.println(driver.getPageSource());
//        System.out.println("========================================================");

        //5)// driver.getWindowHandle(); Icinde olunan sayfa ve/veya tab’larin handle(hash degeri) degerlerini getirir.
         // Bize o window'a ait hash degerini verir. Biz bu hash degerlerini
        // bir String'e atayip pencereler arasi gecis yapabilir.
        System.out.println(driver.getWindowHandle());//CDwindow-A2435E4571C4A3A56F31A3076404E237

    }
}
