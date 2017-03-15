package newpackage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class xxx {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "/Users/vicentesolis/Downloads/geckodriver");
	driver =new FirefoxDriver();
	baseUrl = "xxxxxxx";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

//this is a test for selenium stuff
  @Test
  public void testEpoxyLogin() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("a.xxxxx")).click();
    driver.findElement(By.cssSelector("#xxxxx")).clear();
    driver.findElement(By.cssSelector("#xxxx")).sendKeys("xx@xxx.com");
    driver.findElement(By.cssSelector("#xxx")).clear();
    driver.findElement(By.cssSelector("#xxxxx")).sendKeys("xxx(titxxxxhe");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("input[name=\"commit\"]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.cssSelector("input[name=\"commit\"]")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("#header_menu > label")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("#header_menu > label")).click();
    try {
      assertTrue(isElementPresent(By.linkText("Sign Out")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
