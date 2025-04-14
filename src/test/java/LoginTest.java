import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginpage = new LoginPage(driver);
		Thread.sleep(1000);
	}
	
	@Test
	public void validLogin() throws InterruptedException {
		loginpage.enterCredentials("Admin", "admin123");
		loginpage.clickLogin();
		Thread.sleep(500);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
