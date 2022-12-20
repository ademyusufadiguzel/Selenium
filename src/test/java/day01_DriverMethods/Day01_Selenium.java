package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Selenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://github.com/ademyusufadiguzel/");

        /*
            En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
            webdriver'in yerini gostermek gerekir. Bunun icin Java kutuphanesin'den "Sysyem.setProperty"
            methodu'unu icine ilk olarak driver'i yazariz.Ikinci olarak driver'in fiziki yolunu kopyalari.
         */



    }

}
