import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Modul4Zadanie5LokalizowanieWebelementow {

    public static WebDriver driver;

    @Test
    public void test() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        // 1.  Wejdz na stronę : http://www.selenium-shop.pl/
        driver.get("http://www.selenium-shop.pl/");

        //2. Kliknij zakładkę MOJE KONTO
         driver.findElement(By.linkText("MOJE KONTO")).click();
         System.out.println("Tytuł strony: " + driver.getTitle());
         Assert.assertEquals(driver.getTitle(), "Moje konto – Selenium Shop Automatyzacja Testów");

         // 3.Zweryfikuj czy na stronie jest widoczna prawidłowa liczba przycisków (elementów button)
        List<WebElement> wszystkiePrzyciski = driver.findElements(By.xpath("//button"));
        int liczbaPrzyciskow = wszystkiePrzyciski.size();
//        int liczbaPrzyciskow = driver.findElements(By.xpath("//button")).size();
        System.out.println("Liczba przyciskow na stronie = " + liczbaPrzyciskow);
        Assert.assertEquals(liczbaPrzyciskow, 2);


        //4. Zweryfikuj czy na stronie jest widoczna prawidłowa liczba przycisków (elementów button)
        for(int i = 0; i < liczbaPrzyciskow; i++){
            System.out.println(wszystkiePrzyciski.get(i).getAttribute("value"));
        }
        driver.quit();
    }
}
