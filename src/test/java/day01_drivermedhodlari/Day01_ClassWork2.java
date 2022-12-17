package day01_drivermedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle=driver.getTitle();
        if (actualTitle.contains("facebook")){
            System.out.println("Title testi PASSED");
        }else
            System.out.println("Title testi FAILED"+ actualTitle);

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains("facebook")){
            System.out.println("URL testi PASSED");
        }else System.out.println("Url testi FAILED");

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle=driver.getTitle();
        String expectedWalmartTitle="Walmart.com";
        if (actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("Title testi PASSED");
        }else
            System.out.println("Title testi FAILED");
        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        driver.close();
    }
}
