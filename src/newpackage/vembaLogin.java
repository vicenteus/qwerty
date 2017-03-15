package newpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

public class vembaLogin {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "/Users/vicentesolis/Downloads/chromedriver");
		  WebDriver driver = new ChromeDriver();
			// Storing the Application Url in the String variable
			//Launch the Epoxy.tv website
			driver.get("https://xxx.xxxxxxxx.com/site/login");
			System.out.println("Website - PASS");
  
			
    driver.findElement(By.cssSelector("[id=xx]")).clear();
    driver.findElement(By.cssSelector("[id=xx]")).sendKeys("xxx@xxx.com");
    driver.findElement(By.cssSelector("[id=xx]")).clear();
    driver.findElement(By.cssSelector("[id=xxx]")).sendKeys("xxxx(titxxxhe");
    driver.findElement(By.cssSelector("[id=\"xx\"]")).click();
   
    // wait for Distribute page to load
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement element = wait.until(
    		ExpectedConditions.elementToBeClickable(By.id("navDiscover")));
    //click discover
    driver.findElement(By.id("navDiscover")).click();

    driver.close();
    

	}}
