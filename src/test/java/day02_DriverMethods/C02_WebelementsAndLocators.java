package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebelementsAndLocators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// Acilan browser'i tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//

        //Amazon sayfasina gidelim
        driver.navigate().to("http://amazon.com");
        //Search bolumunu locate edelim
        WebElement webSearch = driver  .findElement(By.id("twotabsearchtextbox"));
        webSearch.sendKeys("city bike", Keys.ENTER);

        List<WebElement> aramaSonucYazısı = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Arama Sonuc Yazisi : "+aramaSonucYazısı.get(0).getText());

        //Arama sonuc sayisini konsola yazdiriniz
        String [] sonucSayisi = aramaSonucYazısı.get(0).getText().split(" ");
        System.out.println("sonucSayisi = " + sonucSayisi[2]);

        //Sonuc sayisini lambda ile yazdiri.
        Arrays.stream(aramaSonucYazısı.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);

        //Karsina cikan ilk sonucun resmine tiklayin
        List<WebElement> ilkWE = driver.findElements(By.className("s-image"));
        ilkWE.get(10).click();

        /*
        Eger bir webelementi (Web sayfasindaki herbir buton yada text) locate (konumunu belirleme)
        etmek istersek once manuela olarak web sayfasini acip sayfa uzeinde sag click yapip incele'ye tiklariz.
        Karsimiza cikan HTML kodlarindan locater'lardan (konum belirleyiciler) essiz olani seceriz.
        Genellikle id Attribute'u kullanilir. Sectiginiz attribute degerini findelemnt() methodu icine
        findelement(By.id("atribute degeri")) seklinde yazariz
         */


    }

}
