import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestAppium extends BaseClass {



        WebDriver driver;

        @Test
        public void testOne()
        {
            driver.get("https://www.google.com");
            driver.findElement(By.name("q")).sendKeys("automation");
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
            System.out.println("completed one");
        }
    }
