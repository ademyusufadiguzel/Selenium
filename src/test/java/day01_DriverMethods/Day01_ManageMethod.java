package day01_DriverMethods;

import org.openqa.selenium.WebDriver;

public class Day01_ManageMethod {

    public static void main(String[] args) throws InterruptedException {

/*
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfayi simge durumuna getirin
simge durumunda 3 saniye bekleyip sayfayi maximize yapin
Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
Sayfayi fullscreen yapin
Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
Sayfayi kapatin

*/

        WebDriver driver = MyLibrary.driverKurulum();

        driver.navigate().to("https://www.amazon.com/");
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutu = "+driver.manage().window().getSize());

        driver.manage().window().minimize();
        Thread.sleep(3000);

        driver.manage().window().maximize();

        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutu = "+driver.manage().window().getSize());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutu = "+driver.manage().window().getSize());

        Thread.sleep(10000);
        driver.close();



    }

}
