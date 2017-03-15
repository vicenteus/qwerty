package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyClass {

	 public static void main(String[] args) {

		 WebDriver driver;
		 System.setProperty("webdriver.gecko.driver", "/Users/vicentesolis/Downloads/geckodriver");
		 driver =new FirefoxDriver();

		  driver.get("http://xxxxx.tv");
		  String i = driver.getCurrentUrl();
		  System.out.println(i);
		  driver.close();
		 }
		}