package day03_Xpath;

import org.bouncycastle.est.LimitedSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Spend less")) {
            System.out.println("TEST title PASSED");
        } else System.out.println("TEST title FAILED");
        //6Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
        //7Birthday butonuna basin
        driver.findElement(By.cssSelector("img[src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();
        //8 Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> bestSellers = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        bestSellers.get(0).click();
        //9- Gift card details’den 25 $’i secin
        WebElement Gift25Click = driver.findElement(By.cssSelector("span[id='a-autoid-28']"));
        Gift25Click.click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement Gift25$ =  driver.findElement(By.cssSelector("span [id='gc-live-preview-amount']"));
        String price = "$25.00";
        if (Gift25$.getText().equals(price)){
            System.out.println("TEST PRICE PASSED");
        }else {
            System.out.println("TEST PRICE FAILED");
        }
        //10-Sayfayi kapatin
        driver.close();

    }
}
