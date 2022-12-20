package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = MyLibrary.driverKurulum();

        driver.navigate().to("https://amazon.com");

        driver.navigate().to("https://apple.com");

        driver.navigate().back();

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.close();

    }

}
