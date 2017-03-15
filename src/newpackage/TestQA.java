package newpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

public class TestQA {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "/Users/vicentesolis/Downloads/chromedriver");
		  WebDriver driver = new ChromeDriver();
			// Storing the Application Url in the String variable
			//Launch the Epoxy.tv website
			driver.get("http://www.xxxxxx.tv/");
			System.out.println("Website - PASS");
			 
			// Login to Epoxy Channel
			driver.findElement(By.className("xxxx")).click();
			driver.findElement(By.cssSelector("[id=xxx]")).clear();
			driver.findElement(By.cssSelector("[id=xxx]")).sendKeys("xxxx@xxx.com");
			driver.findElement(By.cssSelector("[id=xxx]")).clear();
			driver.findElement(By.cssSelector("[id=xxx]")).sendKeys("xxxxxxx");
			driver.findElement(By.name("commit")).click();
			System.out.println("Login - PASS");
			
			//Share text to channel
			driver.findElement(By.name("text")).click();
			driver.findElement(By.cssSelector("[xxxxxx-selenium=\"xxxx xx - xxxx\"]")).sendKeys("moonzshard");
			driver.findElement(By.cssSelector("[data-xxxxx=\"xxxx\"]")).click();
			driver.findElement(By.cssSelector("[data-xxxx=\"Sx\"]")).click();
		    driver.findElement(By.cssSelector("[xxxx-selenium=\"xxxxx"]")).click();
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    WebElement element = wait.until(
		    		ExpectedConditions.elementToBeClickable(By.cssSelector("[data-selenium=\"Share Form - OK\"]")));
		    driver.findElement(By.cssSelector("[xxx-xxxx=\"Sharexx xxxx - OK\"]")).click();
		    System.out.println("Share Text - PASS");

			}
		}