package day01_DriverMethods;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Day01_ClassWork2 {

    public static void main(String[] args) throws InterruptedException {

/*
ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
https://www.walmart.com/ sayfasina gidin.
Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
Tekrar “facebook” sayfasina donun
Sayfayi yenileyin
Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
*/

        WebDriver driver = MyLibrary.driverKurulum();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// Bu method sayfadaki herbir webelement icin
                                                                          // max. bekleme suresini belirler

        driver.navigate().to("https://facebook.com");

        String titleVerify = driver.getTitle();

        if (titleVerify.contains("facebook")) {
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED");
            System.out.println("Title name = "+ titleVerify);
        }

        String urlVerify = driver.getCurrentUrl();

        if (urlVerify.contains("facebook")){
            System.out.println("Url test PASSED");
        }else {
            System.out.println("Url test FAILED");
            System.out.println("Url = "+urlVerify);
        }

        driver.navigate().to("https://www.walmart.com");

        String titleVerifySecondWebSite = driver.getTitle();

        if (titleVerifySecondWebSite.contains("Walmart.com")){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED");
        }

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.manage().window().maximize();
        Thread.sleep(10000);

        driver.close();






    }

}
