package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork02 {
    /*
1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine  "username" yazdirin
4. Password alanine "password" yazdirin
5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
6. Online Banking menusunden Pay Bills sayfasina gidin
7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
8. tarih kismina "2020-09-10" yazdirin
9. Pay buttonuna tiklayin
10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("http://zero.webappsecurity.com");

        driver.findElement(By.cssSelector("button[id='signin_button']")).click();

        driver.findElement(By.cssSelector("input[id='user_login']")).sendKeys("username");

        driver.findElement(By.cssSelector("input[id='user_password'")).sendKeys("password");

        driver.findElement(By.cssSelector("input[type='submit'")).click();
        Thread.sleep(5000);

        driver.navigate().back();

        driver.findElement(By.cssSelector("li[id='onlineBankingMenu'")).click();

        driver.findElement(By.cssSelector("span[id='pay_bills_link'")).click();

        driver.findElement(By.cssSelector("input[id='sp_amount'")).sendKeys("25000");

        driver.findElement(By.cssSelector("input[class='span4 hasDatepicker'")).sendKeys("2020-09-10");

        driver.findElement(By.cssSelector("input[id='pay_saved_payees'")).click();
        Thread.sleep(3000);

        String message = driver.findElement(By.cssSelector("div[id='alert_content'")).getText();

        if (message.equals("The payment was successfully submitted.")) {
            System.out.println("TEST MESSAGE PASSED");
        } else {
            System.out.println("TEST MESSAGE FAILED");
        }
    }
}
