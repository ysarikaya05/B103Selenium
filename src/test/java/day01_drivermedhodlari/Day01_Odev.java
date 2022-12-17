package day01_drivermedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_Odev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Youtube ana sayfasina gidelim . https://www.youtube.com/

        //            Amazon soyfasina gidelim. https://www.amazon.com/
        //            Tekrar YouTube’sayfasina donelim
        //            Yeniden Amazon sayfasina gidelim
        //           Sayfayi Refresh(yenile) yapalim
        //           Sayfayi kapatalim / Tum sayfalari kapatalim


        /*
        Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
Sayfayi kapatin
         */
    }
}
