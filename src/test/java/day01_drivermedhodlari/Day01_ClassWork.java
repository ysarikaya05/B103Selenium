package day01_drivermedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
        System.out.println(" Sayfa Basligi: " + driver.getTitle());// Sayfa Basligi: Amazon.com. Spend less. Smile more.
        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Amazon")) {
            System.out.println("Title testi PASSED");//Title testi PASSED
        } else {
            System.out.println("Title testi FAILED");//Title testi FAILED
        }
        //Sayfa adresini(url) yazdirin

        System.out.println("Sayfa Url: " + driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("Amazon")) {
            System.out.println("Url testi PASSED");
        } else
            System.out.println("Url testi FAILED");
        //Sayfa handle degerini yazdirin
        System.out.println("Sayfa Handle :" + driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if (sayfaKodlari.contains("Gateway")) {
            System.out.println("Source testi PASSED");
        } else
            System.out.println("Source testi FAILED");


        //Sayfayi kapatin.
        driver.close();
    }


}
