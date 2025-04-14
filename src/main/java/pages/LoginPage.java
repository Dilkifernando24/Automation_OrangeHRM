package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginBtn = By.xpath("//button[@type=\"submit\"]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterCredentials(String userName, String Password) {
		driver.findElement(username).sendKeys(userName);
		driver.findElement(password).sendKeys(Password);
		
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
		
	}

}
