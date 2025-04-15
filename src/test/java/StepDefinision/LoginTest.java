package StepDefinision;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	LoginPage loginpage;
	
	@Given("navigate to the OrangeHRM")
	public void navigate_to_the_orange_hrm() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginpage = new LoginPage(driver);
		Thread.sleep(1000);
	    
	}
	
	@And("^enter (.*) and (.*)$")
	public void enter_username_and_password(String Username, String Password) throws InterruptedException {
		loginpage.enterCredentials(Username,Password);
		Thread.sleep(500);
	}

	@Then("click login button")
	public void click_login_button() {
		loginpage.clickLogin();
	}

}
