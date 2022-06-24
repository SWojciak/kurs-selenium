import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Modul3Lekcja6RunConfigurator {

    public static WebDriver driver;

    @Test
    public void test(){

        System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");

        driver = new EdgeDriver();

        driver.get("http://www.selenium-shop.pl/");

        driver.manage().window().maximize();

        System.out.println("Tytuł strony: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Selenium Shop Automatyzacja Testów");
        
    }

    @Test
    public void test2(){

        System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");

        driver = new EdgeDriver();

        driver.get("http://www.selenium-shop.pl/moje-konto/");

        driver.manage().window().maximize();

        System.out.println("Tytuł strony: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Moje konto – Selenium Shop Automatyzacja Testów");

    }
}
