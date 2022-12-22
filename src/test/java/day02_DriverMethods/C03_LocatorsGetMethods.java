package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        // Search bolumunu locate edip iphone aratalim

        // Arama sonuc yazisini konsola yazdiralim
        // Sayfayi kapatalim

    }
}
