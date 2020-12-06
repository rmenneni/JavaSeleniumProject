package android.cell;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MobileTest {
	WebDriver driver;
	
	@Parameters("testingUrl")
	@BeforeTest
	public void setup(String url) {
		String testUrl = url;
		System.setProperty("webdriver.chrome.driver", "C:\\SSS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(testUrl);
	}
	
	@Test
	public void androidMobile() {
		System.out.println("Testing android");
		//driver.get("http://www.amazon.com");
	}
	
	@Test
	public void androidTablet() {
		System.out.println("Testing android tablet");
		//driver.get("http://www.amazon.com");
		String amazonTitle = driver.getTitle();
		System.out.println(amazonTitle);
		String expeectdTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		Assert.assertEquals(expeectdTitle, amazonTitle);
		//Assert.assertTrue(true);
		
	}
	
	@Test
	public void tearDown() {
		//close the browser here.
		driver.quit();
	}
}
