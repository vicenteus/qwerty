package newpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

public class Share_Text {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "/Users/vicentesolis/Downloads/chromedriver");
		  WebDriver driver = new ChromeDriver();
			// Storing the Application Url in the String variable
			//Launch the Epoxy.tv website
			driver.get("xxx");
			System.out.println("Website - PASS");
			 
			// Login to Epoxy Channel
			driver.findElement(By.className("xxx")).click();
			driver.findElement(By.cssSelector("[xxx")).clear();
			driver.findElement(By.cssSelector("[xxx")).sendKeys("xxx@gmail.com");
			driver.findElement(By.cssSelector("xxx")).clear();
			driver.findElement(By.cssSelector("[xxx")).sendKeys("xxx");
			driver.findElement(By.name("commit")).click();
			System.out.println("Login - PASS");
			
			//Share text to channel
			driver.findElement(By.name("text")).click();
			driver.findElement(By.cssSelector("xxx")).sendKeys("testing!");
			driver.findElement(By.cssSelector("xxx")).click();
			driver.findElement(By.cssSelector("xxx")).click();
		    driver.findElement(By.cssSelector("xxx")).click();
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    WebElement element = wait.until(
		    		ExpectedConditions.elementToBeClickable(By.cssSelector("xxx")));
		    driver.findElement(By.cssSelector("xxx")).click();
		    System.out.println("Share Text - PASS");
		    
		    //Kill the browser
		    driver.close();

			}
		}