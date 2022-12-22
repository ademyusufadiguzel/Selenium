package day02_DriverMethods;

import day01_DriverMethods.MyLibrary;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {

    static WebDriver driver;

    public static void main(String[] args) {
        /*
         Ilk once Browser'i maximize yapalim sonra tum sayfa icin max bekleme suresi olarak 15 saniye belirtelim
         Sirasiyla Amazon , Facebook ve Youtube sayfalarina gidelim ve
         Amazon sayfasina tekrar donelim
         Amazon sayfasinin Url'ini https://www.amazon.com/ adresine esit oldugunu test edelim
         Sayfanin konumunu ve pozisyonunu yazdiralim
         Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim
         ve istedigimiz sekilde oldugunu test edelim
         ve sayfayi kapatalim
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().to("https://www.youtube.com/");

        driver.navigate().back();
        driver.navigate().back();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url Testi PASSED");
        } else {
            System.out.println("Url Testi FAILED");
        }

        System.out.println("Sayfanin size'i : " + driver.manage().window().getSize());
        System.out.println("Sayfanin konumu : " + driver.manage().window().getPosition());

        driver.manage().window().setSize(new Dimension(600, 600));
        driver.manage().window().setPosition(new Point(80, 100));

        System.out.println("Sayfanin yeni size'i : " + driver.manage().window().getSize());
        System.out.println("Sayfanin yeni konumu : " + driver.manage().window().getPosition());

        Dimension actualYeniSize = driver.manage().window().getSize();
        if (actualYeniSize.getWidth() == 600 && actualYeniSize.getHeight() == 600) {
            System.out.println("Size Testi PASSED");
        } else {
            System.out.println("Size Testi FAILED");
        }

        Point actualYeniKonum = driver.manage().window().getPosition();
        if (actualYeniKonum.getX() == 80 && actualYeniKonum.getY() == 100) {
            System.out.println("Konum Testi PASSED");
        } else {
            System.out.println("Konum Testi FAILED");
        }

        driver.close();
    }
}
