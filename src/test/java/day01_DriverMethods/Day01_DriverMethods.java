package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();// Bos bir browser actik
        driver.get("https://apple.com");// Ilk olarak girmek istedigimiz sayfayi belirtiriz.
        System.out.println("Sayfa basligi : "+driver.getTitle());
        System.out.println("Sayfa url : "+driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        System.out.println(" = " + driver.getWindowHandle());// Bize o window'a ait hash degerini verir. Biz bu hash degerilerini
                                                             // bir String'e atayip pencereler arasi gecis yapabiliriz.

    }

}
