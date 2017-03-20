package newpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;


import java.util.concurrent.TimeUnit;

/**
 * Created by vicentesolis on 3/15/17.
 */
public class youtube_Navigation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/vicentesolis/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.close();

    }
