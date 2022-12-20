package day01_DriverMethods;

import org.openqa.selenium.WebDriver;

public class HomeWork {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = MyLibrary.driverKurulum();

/*
    Youtube ana sayfasina gidelim . https://www.youtube.com/
    Amazon soyfasina gidelim. https://www.amazon.com/
    Tekrar YouTube'sayfasina donelim
    Yeniden Amazon sayfasina gidelim
    Sayfayi Refresh(yenile) yapalim
    Sayfayi kapatalim / Tum sayfalari kapatalim
*/

    driver.navigate().to("https://www.youtube.com/");

    driver.navigate().to("https://www.amazon.com/");

    driver.navigate().back();

    driver.navigate().forward();
    Thread.sleep(3000);

    driver.navigate().refresh();
    Thread.sleep(3000);

    driver.close();




    }

}
