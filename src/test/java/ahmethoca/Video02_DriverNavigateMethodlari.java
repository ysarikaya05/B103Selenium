package ahmethoca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video02_DriverNavigateMethodlari {

    public static void main(String[] args) {

        //web sayfalari arasinda dolasacaksak DriverNavigateMethodlarini kullanacagiz.
        WebDriver driver = new ChromeDriver();

        //1)driver.navigate( ).to(String Url); String olarak girilen Url’e gider
        //driver.get(url)ile ayni islemi yapar ama forward ve back yapilmasina imkan tanir.
        driver.get("https://amazon.com");
        driver.navigate().to("https://facebook.com");

        // 2)driver.navigate( ).back (); Icinde olunan sayfadan, geldigi onceki sayfaya dondurur
        driver.navigate().back();//ornegimizde amazona geri donus yapacaktir.

        //3)- driver.navigate( ).forward (); Back ile donulen bir sayfadan tekrar ileri gider
        driver.navigate().forward();//ornegimizde facebook donus yapacaktir

        //4)- driver.navigate( ).refresh (); Icinde olunan sayfayi yeniler.
        driver.navigate().refresh();

        //Note:driver olusturuldugunda acilan sayfayi kapatmak istersek
        //driver.close();

        //driver calisirken birden fazla tab veya window actiysa tumunu kapatmak icin
        driver.quit();
    }
}
