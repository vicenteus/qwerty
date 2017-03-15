package newpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.support.ui.Select;

public class Share_Clip {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "/Users/vicentesolis/Downloads/chromedriver");
		  WebDriver driver = new ChromeDriver();
			// Storing the Application Url in the String variable
			//Launch the Epoxy.tv website
			driver.get("xxx");
			System.out.println("Website - PASS");
			 
			// Login to Epoxy Channel
			driver.findElement(By.className("xxx")).click();
			driver.findElement(By.cssSelector("xxx")).clear();
			driver.findElement(By.cssSelector("xxx")).sendKeys("xxx");
			driver.findElement(By.cssSelector("xxx")).clear();
			driver.findElement(By.cssSelector("xxx")).sendKeys("xxx");
			driver.findElement(By.name("commit")).click();
			System.out.println("Login - PASS");
			
			// Share clip to channel
			driver.findElement(By.cssSelector("xxx)).click();
			driver.findElement(By.cssSelector("xxx")).click();
			driver.findElement(By.cssSelector("xxx")).click();
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    WebElement element = wait.until(
		    		ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr[1]")));
			driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr[1]")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 10);
			WebElement element1 = wait.until(
					ExpectedConditions.elementToBeClickable(By.cssSelector("xxx")));
			driver.findElement(By.cssSelector("xxx")).click();
			driver.findElement(By.cssSelector("xxx")).click();
			driver.findElement(By.cssSelector("xxx")).click();
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			WebElement element2 = wait.until(
					ExpectedConditions.elementToBeClickable(By.cssSelector("xxx")));
			driver.findElement(By.cssSelector("xxx")).click();
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			WebElement element3 = wait.until(
					ExpectedConditions.elementToBeClickable(By.cssSelector("xxx")));
			driver.findElement(By.cssSelector("xxx")).click();
			driver.findElement(By.cssSelector("xxx")).click();
		    driver.findElement(By.cssSelector("xxx")).click();
		    driver.findElement(By.cssSelector("xxx")).click();
		    WebDriverWait wait4 = new WebDriverWait(driver, 10);
		    WebElement element4 = wait.until(
		    		ExpectedConditions.elementToBeClickable(By.cssSelector("xxx")));
		    driver.findElement(By.cssSelector("xxx")).click();
		    System.out.println("xxx");
		    
		    // Kill Browser
		    driver.close();
		  
			
}}
