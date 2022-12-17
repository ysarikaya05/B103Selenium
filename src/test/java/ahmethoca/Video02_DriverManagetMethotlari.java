package ahmethoca;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Video02_DriverManagetMethotlari {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1) driver.manage().window( );Method’lari
        //1-A:- driver.manage().window().getSize( ); Browser’in olculerini verir.İcinde oldugu sayfanin Pixel olarak olculerini dondurur.
        System.out.println(driver.manage().window().getSize());//(1051, 798)


        //1-B:- driver.manage().window().getPosition( ); Browser’in koordinatlarini verir.İcinde oldugu sayfanin Pixel olarak konumunu dondurur.
        System.out.println(driver.manage().window().getPosition());//(9, 9)

        //1-C:- driver.manage().window().setPosition(new Point ( x:80 , y:0 ) ) ; Browser’i istenen koordinata tasir.
        // icinde oldugu sayfanin sol alt kosesini bizim yapacagimiz piksel noktasina tasir.
        driver.manage().window().setPosition(new Point(15, 15));
        //1-D:- driver.manage().window().setSize(new Dimension( 800 , 600 )); Browser’i istenen olculere getirir.
        // icinde oldugu sayfanin sol alt kosesi sabit olarak bizim yapacagimiz olculere getirir.
        driver.manage().window().setSize(new Dimension(900, 600));

        //konumu ve boyutu deggistirdikten sonra tekrar yazdirirsak
        System.out.println("yeni pencere olculeri :" + driver.manage().window().getSize());//yeni pencere olculeri :(902, 602)

        System.out.println("yeni pencere konumu:" + driver.manage().window().getPosition());//yeni pencere konumu:(13, 13)


        //1-E: driver.manage().window().maximize(); Browser’i maximize yapar. icinde oldugu sayfayi maximize yapar
        //1-G: driver.manage().window().fullscreen(); Browser’i full screen yapar.icinde oldugu  sayfayi full screen yapar

        //Farklari gormek icin bu methodlari kullanip,baslangic noktalarini ve boyutlarini yazdiralim.
        driver.manage().window().maximize();
        System.out.println("maximize konum :" + driver.manage().window().getPosition());//maximize konum :(-8, -8)
        System.out.println("maximize boyut :" + driver.manage().window().getSize());//maximize boyut :(1552, 832)

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum:" + driver.manage().window().getPosition());//fullscreen konum:(0, 0)
        System.out.println("fullscreen boyut:" + driver.manage().window().getSize());//fullscreen boyut:(1536, 864)

        //1-G:- driver.manage().window().minimize(); Browser’i minimize yapar.Sayfayi simge durumunda kucultur.
        driver.manage().window().minimize();

        //2-- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));Istenen sayfa acilincaya kadar maximum
        //bekleme suresini belirtir

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.close();//sadece calisilan browser 'i kapatir

        driver.quit();//acik olan tum browser 'lari kapatir


    }
}
