package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//button[@type='submit']");
	By dashboard = By.xpath("//h6[text()='Dashboard']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterCredentials(String Username, String Password) {
		driver.findElement(username).sendKeys(Username);
		driver.findElement(password).sendKeys(Password);
		
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
		
	}
	
	public void verifylogin() {
		String dashboardHeader = driver.findElement(dashboard).getText();
		Assert.assertEquals(dashboardHeader, "Dashboard", "Login was not successful!");
		
	}

}
