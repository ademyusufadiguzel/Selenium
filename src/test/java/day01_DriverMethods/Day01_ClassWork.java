package day01_DriverMethods;

import dev.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {

    public static void main(String[] args) {
/*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
                Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.
*/
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println("Sayfa basligi = " + driver.getTitle());
        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Amazon")) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Title test FAILED");
        }

        System.out.println("Sayfa adresi = " + driver.getCurrentUrl());
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains("amazon")) {
            System.out.println("Url test PASSED");
        } else {
            System.out.println("Url test FAILED");
        }

        System.out.println("Window Handle = " + driver.getWindowHandle());

        String pageSource = driver.getPageSource();

        if (pageSource.contains("Gateway")) {
            System.out.println("Gateway test PASSED");
        } else {
            System.out.println("Gateway test FAILED");
        }

        driver.close();


    }

}
