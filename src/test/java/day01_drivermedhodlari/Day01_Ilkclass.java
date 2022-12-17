package day01_drivermedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Ilkclass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        /*
        En temel haliyle otomasyon yapmak icin classimiza otomasyon icin gerekli olan webdriverin yerini gostermemiz gerekir.
        bunu icin Java kutuphanesinden System.setProperty methodunu icine ilk olarak driveri yazariz.
        İkinci olarak driverin fiziki yolunu kopyalariz.
         */
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.techproeducation.com");
        driver.get("https://www.amazon.com");


    }
}
