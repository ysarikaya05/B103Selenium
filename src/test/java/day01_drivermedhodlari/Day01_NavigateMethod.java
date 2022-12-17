package day01_drivermedhodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        get(), belirli bir URL’de (web sitesinde) gezinmek ve sayfa yüklenene kadar beklemek için kullanılır. sürücü.
        Navigation(), belirli bir URL’ye gitmek için kullanılır ve sayfanın yüklenmesini beklemez
         */

        //Amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");

        //Techproeducation sayfasina gidelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://www.techproeducation.com");

        //Tekrar Amazon sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Tekrar Hepsiburada sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //Son sayfada sayfayi yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Sayfayi kapatalim
        driver.close();




    }
}
