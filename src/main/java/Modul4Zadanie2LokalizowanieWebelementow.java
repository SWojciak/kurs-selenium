import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Modul4Zadanie2LokalizowanieWebelementow {

    public static WebDriver driver;

    @Test
    public void test() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://www.selenium-shop.pl/produkt/koszulka-tottenham-hotspur-f-c/");
        driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();

        driver.get("http://www.selenium-shop.pl/koszyk/");
        driver.findElement(By.xpath("//input[@type='text'][@name='coupon_code']"));

        driver.get("http://www.selenium-shop.pl/koszyk/");
        driver.findElement(By.xpath("//td[@class='product-price']/span"));

        driver.get("http://www.selenium-shop.pl/koszyk/");
        driver.findElement(By.xpath("//button[@value='Zastosuj kupon']"));

        driver.get("http://www.selenium-shop.pl/koszyk/");
        driver.findElement(By.xpath("//td[@class='product-thumbnail']/a/img"));

        driver.get("http://www.selenium-shop.pl/koszyk/");
        driver.findElement(By.xpath("//input[starts-with(@id,'shipping_method_0_flat')]"));

        driver.get("http://www.selenium-shop.pl/koszyk/");
        driver.findElement(By.xpath("//h2[contains(text(),'Podsumowanie')]"));

        driver.get("http://www.selenium-shop.pl/koszyk/");
        driver.findElement(By.xpath("//th[contains(text(),'Produkt')]"));
    }
}
