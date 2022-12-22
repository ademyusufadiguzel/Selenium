package day03_Xpath;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        //WebElement buttonLocation = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        WebElement addButtonT = driver.findElement(By.xpath("//*[text()='Add Element']"));
        addButtonT.click();
        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@class='added-manually']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElYazisi = driver.findElement(By.xpath("//h3"));
        if (addRemoveElYazisi.isDisplayed()){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


    }
}
