import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    ChromeOptions options = new ChromeOptions();

        WebDriver driver ;

    @Test
    public void checkTitle(){
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://practicesoftwaretesting.com/");
        Assert.assertEquals("Practice Software Testing - Toolshop - v5.0 a",driver.getTitle());
        System.out.println("Check title----------------");
    }

    @Test
    public void checkContactHeading(){
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
       driver = new ChromeDriver(options);
        driver.get("https://practicesoftwaretesting.com/contact");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement heading = wait.until(d-> driver.findElement(By.tagName("h3")));
        String headingText = heading.getText();
        Assert.assertEquals("Contact",headingText);
        System.out.println("checkContactHeading ----------------");
    }
}
