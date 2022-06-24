import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Modul4Zadanie1LokalizowanieWebelementow {

    public static WebDriver driver;

    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://www.selenium-shop.pl/moje-konto/");
        driver.findElement(By.name("register"));
        driver.findElement(By.id("reg_email"));

        driver.get("http://www.selenium-shop.pl/produkt/koszulka-tottenham-hotspur-f-c/");
        driver.findElement(By.className("qty"));
        driver.findElement(By.linkText("Koszulki"));

        driver.get("http://www.selenium-shop.pl");
        driver.findElement(By.partialLinkText("SEE ALL"));
    }


}
