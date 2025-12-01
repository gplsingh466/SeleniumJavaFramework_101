import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void checkTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        Assert.assertEquals("Practice Software Testing - Toolshop - v5.0",driver.getTitle());
    }
}
