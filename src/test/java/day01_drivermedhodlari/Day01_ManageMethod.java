package day01_drivermedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ManageMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon soyfasina gidelim. https://www.amazon.com/
       driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu:"+ driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari:"+driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("sayfanin konumu:"+ driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari:"+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("sayfanin konumu:"+ driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari:"+driver.manage().window().getSize());

        //Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
